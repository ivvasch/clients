CREATE OR REPLACE PACKAGE IVV_REST_CLIENTS is

  -- Author  : VASCHENKO
  -- Created : 03.08.2021 17:14:18
  -- Purpose : 
  PROCEDURE ivvRestClients(err OUT VARCHAR2);
  
END IVV_REST_CLIENTS;
/
create or replace package body IVV_REST_CLIENTS is

PROCEDURE ivvRestClients(err OUT VARCHAR2)
  IS
  -- коллекция входящих данных
   ivv_rest_in    ivv_rest_clients_str.c_inData;
  -- коллекция исходящих данных
   ivv_rest_out   ivv_rest_clients_str.c_outData;
  -- сообщение об ошибках
   errMsg         VARCHAR2(300);
   cnt            NUMBER;
   
BEGIN
  -- запускаем метод инициализации входящих параметров в нашей структуре где описаны все коллекции.
  -- в метод передаем первым параметом пустое значение т.к. это у нас идет родительский класс, для дальнейшего понимания парсером
  -- вторым параметром передаем нашу коллекцию с типом входящих данных. См. inData.
   ivv_rest_clients_str.inData('', ivv_rest_in);
   
/**
* Необходимо вызвать функцию requestCusData(errMsg). Затем из таблицы 'tblOutParam' наполнить исходящие переменные, очистить ее 'tblInParam.Delete'
* и после уже вызвать функцию наполнения моей структуры данными.
*
* Переименовать класс 'Clients' в класс 'CusInfo' и еще раз просмотреть все переменные по функции 'requestCusData(errMsg)' которые относятся к наполнению
* этого класса.
* 
* Переименовать в классах и структуре 'id' в 'cusnum'. Еще раз подумать стоит ли, возможно мы их приравняем?
* 
* Убрать приставку 'cusinfo' из названий переменных в классе вебсервиса
*
* Уточнить по процедуре handleAddrs() ее переменные тоже необходимо внести в основной класс Cusinfo?
*
* 'tblOutParam' - пустая коллекция? С каким ключом мы туда значение занесем с тем ключом оно там и будет?
*/
   
 IF ext_2Cus_ivv.requestCusData(errMsg) = TRUE THEN
   
   ivv_rest_out(1).c_clients(1).v_lastname       := ext_2kernel.GetOutParam('cusInfo\lastname');
   ivv_rest_out(1).c_clients(1).v_firstName      := ext_2kernel.GetOutParam('cusInfo\firstName');   
   ivv_rest_out(1).c_clients(1).v_middleName     := ext_2kernel.GetOutParam('cusInfo\middleName');   
   ivv_rest_out(1).c_clients(1).d_birthday       := ext_2kernel.getOutParam('cusInfo\birthday');
   ivv_rest_out(1).c_clients(1).v_resident       := ext_2kernel.getOutParam('cusInfo\resident');
   ivv_rest_out(1).c_clients(1).v_inn            := ext_2kernel.getOutParam('cusInfo\inn');
   ivv_rest_out(1).c_clients(1).v_citizenship    := ext_2kernel.getOutParam('cusinfo\citizenship');
   ivv_rest_out(1).c_clients(1).v_magic_word     := ext_2kernel.getOutParam('cusinfo\magic_word');
   ivv_rest_out(1).c_clients(1).v_filial         := ext_2kernel.getOutParam('cusinfo\filial');
   ivv_rest_out(1).c_clients(1).v_cus_qty        := ext_2kernel.getOutParam('cusinfo\cus_qty');
   ivv_rest_out(1).c_clients(1).d_dopen          := ext_2kernel.getOutParam('cusInfo\dopen');
   ivv_rest_out(1).c_clients(1).v_birthplace     := ext_2kernel.getOutParam('cusinfo\birthplace');
   ivv_rest_out(1).c_clients(1).v_sex            := ext_2kernel.getOutParam('cusinfo\sex');
   ---------------------------------------------------------------------------------------------------   
   ivv_rest_out(1).c_clients(1).v_doc_type       := ext_2kernel.getOutParam('cusinfo\doc\type');
   ivv_rest_out(1).c_clients(1).v_doc_ser        := ext_2kernel.getOutParam('cusinfo\doc\ser');
   ivv_rest_out(1).c_clients(1).v_doc_num        := ext_2kernel.getOutParam('cusinfo\doc\num');   
   ivv_rest_out(1).c_clients(1).d_doc_date       := ext_2kernel.getOutParam('cusinfo\doc\date');
   ivv_rest_out(1).c_clients(1).v_doc_agency     := ext_2kernel.getOutParam('cusinfo\doc\agency');
   ivv_rest_out(1).c_clients(1).v_doc_subdiv     := ext_2kernel.getOutParam('cusinfo\doc\subdiv');
   ---------------------------------------------------------------------------------------------------
   
  IF ext_2kernel.getOutParam('cusinfo\addr') IS NOT NULL THEN
    cnt := ext_2kernel.Char2Number(ext_2kernel.getOutParam('cusinfo\addr\count'));
   FOR i IN 1..cnt LOOP 
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_type       := ext_2kernel.SetOutParam('cusinfo\addr\type'      ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_country    := ext_2kernel.SetOutParam('cusinfo\addr\country'   ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_reg_num    := ext_2kernel.SetOutParam('cusinfo\addr\reg_num'   ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_area       := ext_2kernel.SetOutParam('cusinfo\addr\area'      ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_area_type  := ext_2kernel.SetOutParam('cusinfo\addr\area_type' ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_city       := ext_2kernel.SetOutParam('cusinfo\addr\city'      ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_city_type  := ext_2kernel.SetOutParam('cusinfo\addr\city_type' ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_punkt_name := ext_2kernel.SetOutParam('cusinfo\addr\punkt_name'||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_punkt_type := ext_2kernel.SetOutParam('cusinfo\addr\punkt_type'||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_infr_name  := ext_2kernel.SetOutParam('cusinfo\addr\infr_name' ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_infr_type  := ext_2kernel.SetOutParam('cusinfo\addr\infr_type' ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_dom        := ext_2kernel.SetOutParam('cusinfo\addr\dom'       ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_korp       := ext_2kernel.SetOutParam('cusinfo\addr\korp'      ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_kv         := ext_2kernel.SetOutParam('cusinfo\addr\kv'        ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_post_index := ext_2kernel.SetOutParam('cusinfo\addr\post_index'||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_porch      := ext_2kernel.SetOutParam('cusinfo\addr\porch'     ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_oksm_code  := ext_2kernel.SetOutParam('cusinfo\addr\oksm_code' ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_code       := ext_2kernel.SetOutParam('cusinfo\addr\code'      ||i);
   ivv_rest_out(1).c_clients(1).clients_addr(i).v_addr_stroy      := ext_2kernel.SetOutParam('cusinfo\addr\stroy'     ||i);
   END LOOP;
  END IF;
   
   /*ivv_rest_out(1).c_clients(1).v_email          := ext_2kernel.getOutParam('email');
   ivv_rest_out(1).c_clients(1).v_email_type     := ext_2kernel.getOutParam('email_type');
   ivv_rest_out(1).c_clients(1).v_ph_type        := ext_2kernel.getOutParam('ph_type');
   ivv_rest_out(1).c_clients(1).v_ph_cnt         := ext_2kernel.getOutParam('ph_cnt');
   ivv_rest_out(1).c_clients(1).v_ph_city        := ext_2kernel.getOutParam('ph_city');
   ivv_rest_out(1).c_clients(1).v_ph_num         := ext_2kernel.getOutParam('ph_num');
   ivv_rest_out(1).c_clients(1).v_ph_ext_num     := ext_2kernel.getOutParam('ph_ext_num');
   ivv_rest_out(1).c_clients(1).v_ph_sms         := ext_2kernel.getOutParam('ph_sms');*/

   -- Наполняем данными коллекцию клиентских счетов
  IF ext_2kernel.getOutParam('cusinfo\accounts') IS NOT NULL THEN
    cnt := ext_2kernel.Char2Number(ext_2kernel.getOutParam('cusinfo\accounts\count'));
   FOR i IN 1..cnt LOOP
   ivv_rest_out(1).c_clients(1).clients_acc(i).v_caccacc   := ext_2kernel.getOutParam('cusinfo\accounts\caccacc'   ||i);
   ivv_rest_out(1).c_clients(1).clients_acc(i).v_cur       := ext_2kernel.getOutParam('cusinfo\accounts\cur'       ||i);
   ivv_rest_out(1).c_clients(1).clients_acc(i).v_accname   := ext_2kernel.getOutParam('cusinfo\accounts\accname'   ||i);
   ivv_rest_out(1).c_clients(1).clients_acc(i).v_status    := ext_2kernel.getOutParam('cusinfo\accounts\status'    ||i);
   ivv_rest_out(1).c_clients(1).clients_acc(i).v_branch    := ext_2kernel.getOutParam('cusinfo\accounts\branch'    ||i);
   ivv_rest_out(1).c_clients(1).clients_acc(i).v_ostvr     := ext_2kernel.getOutParam('cusinfo\accounts\ostvr'     ||i);
   ivv_rest_out(1).c_clients(1).clients_acc(i).v_ostrr     := ext_2kernel.getOutParam('cusinfo\accounts\ostrr'     ||i);
   ivv_rest_out(1).c_clients(1).clients_acc(i).v_ostvp     := ext_2kernel.getOutParam('cusinfo\accounts\ostvp'     ||i);
   ivv_rest_out(1).c_clients(1).clients_acc(i).v_debdark   := ext_2kernel.getOutParam('cusinfo\accounts\debdark'   ||i);
   ivv_rest_out(1).c_clients(1).clients_acc(i).v_creddark  := ext_2kernel.getOutParam('cusinfo\accounts\creddark'  ||i);
   END LOOP;
  END IF;
   
   
   -- Наполняем коллекцию карт clients_cards
  IF ext_2kernel.getOutParam('cusinfo\card') IS NOT NULL THEN
    cnt := ext_2kernel.Char2Number(ext_2kernel.getOutParam('cusinfo\card\count'));
   FOR i IN 1..cnt LOOP
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_plcid      := ext_2kernel.getOutParam('cusinfo\card\plcid'      ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_plcnum     := ext_2kernel.getOutParam('cusinfo\card\plcnum'     ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_plcv       := ext_2kernel.getOutParam('cusinfo\card\plcv'       ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_caccacc    := ext_2kernel.getOutParam('cusinfo\card\caccacc'    ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_plccur     := ext_2kernel.getOutParam('cusinfo\card\plccur'     ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_pltsysname := ext_2kernel.getOutParam('cusinfo\card\pltsysname' ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_plctype    := ext_2kernel.getOutParam('cusinfo\card\plctype'    ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_period     := ext_2kernel.getOutParam('cusinfo\card\period'     ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_platype    := ext_2kernel.getOutParam('cusinfo\card\platype'    ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_plcprim    := ext_2kernel.getOutParam('cusinfo\card\plcprim'    ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_invstat    := ext_2kernel.getOutParam('cusinfo\card\invstat'    ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_invstatid  := ext_2kernel.getOutParam('cusinfo\card\invstatid'  ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).d_dclose     := ext_2kernel.getOutParam('cusinfo\card\dclose'     ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_ostvr      := ext_2kernel.getOutParam('cusinfo\card\ostvr'      ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_ostrr      := ext_2kernel.getOutParam('cusinfo\card\ostrr'      ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_ostvp      := ext_2kernel.getOutParam('cusinfo\card\ostvp'      ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_plcidosn   := ext_2kernel.getOutParam('cusinfo\card\plcidosn'   ||i);
   ivv_rest_out(1).c_clients(1).clients_cards(i).v_plsnumosn  := ext_2kernel.getOutParam('cusinfo\card\plsnumosn'  ||i);
   END LOOP;
  END IF;

   -- Наполняем коллекцию депозитов 
  IF ext_2kernel.getOutParam('cusinfo\deposit') IS NOT NULL THEN
    cnt := ext_2kernel.Char2Number(ext_2kernel.getOutParam('cusinfo\deposit\count'));
   FOR i IN 1..cnt LOOP
   ivv_rest_out(1).c_clients(1).clients_dep(i).v_idvne      := ext_2kernel.getOutParam('cusinfo\deposit\idvne'     ||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).v_idvny      := ext_2kernel.getOutParam('cusinfo\deposit\idvny'     ||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).v_cur        := ext_2kernel.getOutParam('cusinfo\deposit\cur'       ||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).v_start_sum  := ext_2kernel.getOutParam('cusinfo\deposit\start_sum' ||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).v_ost_sum    := ext_2kernel.getOutParam('cusinfo\deposit\ost_sum'   ||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).d_odate      := ext_2kernel.getOutParam('cusinfo\deposit\odate'     ||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).d_cdate      := ext_2kernel.getOutParam('cusinfo\deposit\cdate'     ||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).v_caccacc    := ext_2kernel.getOutParam('cusinfo\deposit\caccacc'   ||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).v_status     := ext_2kernel.getOutParam('cusinfo\deposit\status'    ||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).v_status_num := ext_2kernel.getOutParam('cusinfo\deposit\status_num'||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).v_prod_num   := ext_2kernel.getOutParam('cusinfo\deposit\prod_num'  ||i);
   ivv_rest_out(1).c_clients(1).clients_dep(i).v_prod       := ext_2kernel.getOutParam('cusinfo\deposit\prod'      ||i);
   END LOOP;
  END IF;

   -- Наполнение коллекции дополнительных данных клиента ТЕЛЕФОНЫ
  IF ext_2kernel.getOutParam('cusinfo\ph') IS NOT NULL THEN
    cnt := ext_2kernel.Char2Number(ext_2kernel.getOutParam('cusinfo\ph\count'));
   FOR i IN 1..cnt LOOP
   ivv_rest_out(1).c_clients(1).clients_dop(1).cclients_dop_ph(i).v_ph_type    := ext_2kernel.getOutParam('cusinfo\ph\type'    ||i); 
   ivv_rest_out(1).c_clients(1).clients_dop(1).cclients_dop_ph(i).v_ph_cnt     := ext_2kernel.getOutParam('cusinfo\ph\cnt'     ||i);
   ivv_rest_out(1).c_clients(1).clients_dop(1).cclients_dop_ph(i).v_ph_city    := ext_2kernel.getOutParam('cusinfo\ph\city'    ||i);
   ivv_rest_out(1).c_clients(1).clients_dop(1).cclients_dop_ph(i).n_ph_num     := ext_2kernel.getOutParam('cusinfo\ph\num'     ||i);
   ivv_rest_out(1).c_clients(1).clients_dop(1).cclients_dop_ph(i).v_ph_ext_num := ext_2kernel.getOutParam('cusinfo\ph\ext_num' ||i);
   ivv_rest_out(1).c_clients(1).clients_dop(1).cclients_dop_ph(i).v_ph_sms     := ext_2kernel.getOutParam('cusinfo\ph\sms'     ||i);
   END LOOP;
 END IF;

   -- Наполнение коллекции дополнительных данных клиента ЕМЕЙЛЫ 
 IF ext_2kernel.getOutParam('cusinfo\em') IS NOT NULL THEN
    cnt := ext_2kernel.Char2Number(ext_2kernel.getOutParam('cusinfo\em\count'));
   FOR i IN 1..cnt LOOP
   ivv_rest_out(1).c_clients(1).clients_dop(1).cclients_dop_em(i).v_em_type    := ext_2kernel.getOutParam('cusinfo\em\type'    ||i);
   ivv_rest_out(1).c_clients(1).clients_dop(1).cclients_dop_em(i).v_em_email   := ext_2kernel.getOutParam('cusinfo\em\email'   ||i);
   END LOOP;
  END IF;

   -- Наполнение дополнительной инф по клиентской истории
  /*IF ext_2kernel.getOutParam('cusinfo\vn_cred_hist\csubgrnt') IS NOT NULL THEN
     cnt := ext_2kernel.Char2Number(ext_2kernel.getOutParam('cusinfo\vn_cred_hist\csubgrnt\count'));
   FOR i IN 1..cnt LOOP
   ivv_rest_out(1).c_clients(1).clients_hist(1).csubgrnt(i).v_name       := ext_2kernel.GetOutParam('name'    ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(1).csubgrnt(i).v_pletype    := ext_2kernel.GetOutParam('pletype' ||i);
   END LOOP;
  END IF;*/
      
   -- Наполнение коллекции клиентской истории
  IF ext_2kernel.getOutParam('cusinfo\vn_cred_hist') IS NOT NULL THEN
   cnt := ext_2kernel.Char2Number(ext_2kernel.getOutParam('cusinfo\vn_cred_hist\count'));
   FOR i IN 1..cnt LOOP
   ivv_rest_out(1).c_clients(1).clients_hist(i).n_vnedocnum   := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\vnedocnum'    ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).n_vnydocnum   := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\vnydocnum'    ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_type        := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\type'         ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_relation    := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\relation'     ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_sum         := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\sum'          ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_cur         := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\cur'          ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_prodnum     := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\prodnum'      ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_prodname    := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\prodname'     ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_branch      := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\branch'       ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).d_dlastplatod := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\dlastplatod'  ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).d_dlastplatp  := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\dlastplatp'   ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_platperod   := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\platperod'    ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_platperp    := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\platperp'     ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_grnt        := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\grnt'         ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_catgrnt     := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\catgrnt'      ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).d_docdate     := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\docdate'      ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_docstate    := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\docstate'     ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).d_statdate    := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\statdate'     ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_credint     := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\credint'      ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_acredint    := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\acredint'     ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).d_lastplatd   := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\lastplatd'    ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_platsum     := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\platsum'      ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_narrsum     := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\narrsum'      ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_arrsumd     := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\arrsumd'      ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_arrsump     := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\arrsump'      ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_nextplatsum := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\nextplatsum'  ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_intimeplatc := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\intimeplatc'  ||i);
   ivv_rest_out(1).c_clients(1).clients_hist(i).v_ovtimeplatc := ext_2kernel.getOutParam('cusinfo\vn_cred_hist\ovtimeplatc'  ||i);
   END LOOP;
  END IF;
 END IF;
   -- Очищаем коллекцию tblOutParam для последующего его наполнения нашими переменными уже через нашу структуру
   ext_2kernel.tblOutParams.DELETE;

   -- Наполняем наш OUT возвращаемыми переменными
   ivv_rest_clients_str.fillOutData('', ivv_rest_out, FALSE);
   
END;

END IVV_REST_CLIENTS;





    
/
