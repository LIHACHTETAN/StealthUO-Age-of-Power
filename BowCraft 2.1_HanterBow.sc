////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
////////////////////////////2.1 Bowcraft Shard Age of Power/////////////////////
/////////////////////////////Forged by LIHACH///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program BScraft;
Var sd,i: Integer;
Const
Katana= $13B6; //Tип Оружия;
Logs= $1BE0; //Тип дерева;
Begin
 ///////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////                                                                         
//                     не трогать....                                       ////
SetARStatus(true);                                                          ////
//Возвращает режим реконнектора: True - реконектор включен, False - выключен////
////////////////////////////////////////////////////////////////////////////////
//                     не трогать....                                       ////
SetPauseScriptOnDisconnectStatus(true);                                     ////
//Задает поведение скрипта при дисконнекте. если True то при дисконнекте,   ////
//все запущенные скрипты встанут на паузу.;                                 ////
////////////////////////////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////////////////////////
 while true do
 Begin
 UOSay(Chr(39)+'craftcreate 0' );
 for i:=1 to 30 do
  begin
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> При 30 будем кушать... ||');
    UseObject(Backpack); //Открываем Рюкзак;
     Findtype(Katana,BackPack);
     if Katana = -1 then
     begin
     AddToSystemJournal('Нет Катаны в рюкзаке...' );
     end;
     Useobject(finditem);
     WaitForTarget(3100);
     if targetpresent then
     begin
     sd:=Findtype(Logs,BackPack);
     if sd <> -1 then
     begin 
     if (GetSkillValue('Bowcraft') >= 55) and (FindTypeEx($1BE0, $0750, Backpack, False) > 10)  then
     begin 
     AddToSystemJournal('Делаем Hunterbow...' );
     TargetToObject(sd);
     WaitMenu ('Bowcraft', 'Bows'); 
     wait(100);
     WaitMenu ('Bows', 'Hunterbow'); ////подменю количество шафтовж 
     //задержка на использование; 
     end
     else
     begin
     AddToSystemJournal('Делаем Newbybow...' );
     TargetToObject(sd);
     WaitMenu ('Bowcraft', 'Bows'); 
     wait(100);
     WaitMenu ('Bows', 'Newbybow'); ////подменю количество шафтовж 
     //задержка на использование; 
     end;
     wait(3100);
     end;
     sd:=Findtype(Logs,BackPack);
     if sd = -1 then
     begin
     AddToSystemJournal('Зкончилось дерево...' );
     end;
     end; 
  end; 
   if FindType($097B, backpack) > 0 THEN
    begin
    AddToSystemJournal('Кушаем...' );
    UseObject(finditem);
    wait(3000);
    end;
 UOSay(Chr(39)+'Resend' );
 AddToSystemJournal('Ресенд...');
 wait(8000);    
 End;    
End.
