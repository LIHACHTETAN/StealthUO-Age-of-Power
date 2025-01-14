////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////////1.1 Alchemy Refresh Shard Age of Power/////////////
/////////////////////////////Forged by LIHACH///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program HealCraft;
Var i: Integer;
    Gins, BottlesID, Heal : Cardinal;
Const
Mortar=   $0E9B;//Tип Mortar;
Boottles= $0F0E;//Тип Boottles;
Box=  $666320BA;//серия сундука куда будет складывать;Обезательно указать;

 Begin
 ///////////////////////////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////////////////////////                                                                         
 ///                   не трогать....                                       ////
 SetARStatus(true);                                                          ///
 //Возвращает режим реконнектора: True - реконектор включен, False - выключен///
 ///////////////////////////////////////////////////////////////////////////////
 //                     не трогать....                                       ///
 SetPauseScriptOnDisconnectStatus(true);                                     ///
 //Задает поведение скрипта при дисконнекте. если True то при дисконнекте,   ///
 //все запущенные скрипты станут на паузу.;                                 ///
 ///////////////////////////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////////////////////////
  while true do
  Begin
   for i:=1 to 30 do
   begin
   finddistance:= 4;
   AddToSystemJournal('30=' + IntToStr(i) + ' >>> При 30 будем кушать... ||');
    
     repeat
      UseObject(Backpack); //Открываем Рюкзак;
      wait(100);
      Heal:=Findtype($0F0B,BackPack);
       if Heal > 0 then
       begin 
       UseObject(Box);
       FindType($0F0B,BackPack);
       if finditem <> 0 then 
       begin
       FindType($0F0B,Box);
       if finditem = 0 then
       MoveItem(Heal,0,Box,0,0,0)
       else
       MoveItem(Heal,0,Finditem,0,0,0)
       end;  
       end;
       wait(400);
       until Heal = 0;
     Findtype(Mortar,BackPack);
     if Mortar = -1 then
     begin
     AddToSystemJournal('Нет Mortar в рюкзаке...' );
     end;
     Useobject(finditem);
     WaitForTarget(3000);
     if targetpresent then
     begin
     BottlesID:=Findtype(Boottles,BackPack);
     if BottlesID <> -1 then
      begin
      Gins:=Findtype($0F7A,BackPack);
       if Gins <> -1 then
       begin
       TargetToObject(BottlesID);
       AddToSystemJournal('Варим Refresh...' );
       WaitMenu ('Alchemy', 'Refresh Potions');
       WaitMenu ('Refresh Potions', 'Total refresh potion'); 
       //задержка на использование;
       CancelMenu;
       wait(7600);
       end;
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
  end;
 end.
    
