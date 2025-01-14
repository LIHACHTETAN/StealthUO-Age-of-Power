////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
///////////////////////////1.2 BlackSmithy Shard Age of Power///////////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program BlackSmithy;
Var sd,i: Integer;
Const
Katana= $0FBC ; //Tип Молотка;
TinkerTool=$1EBC;
Logs= $1BF2; //Тип Инготов;
BoxBig= $6599A3BD; //Сундук с срудой ID;
Ruda= $19B9; //Tип Руды;
Stanok=  $65CDA95A; //Плавильня ID;
Kolichestvo= 30; // Количество руды для переплавки;
{$Include 'BSCraft.inc'}
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
 for i:=1 to 100 do
  begin 
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> При 30 будем кушать... ||');
    UseObject(Backpack); //Открываем Рюкзак;
    wait(100);
     FindTypeEx(Katana,-1,BackPack,true);
     if finditem = 0 then
     begin
     AddToSystemJournal('Нет Молотка в рюкзаке...' );

     FindTypeEx(TinkerTool,-1,BackPack,true);
     Useobject(finditem);
     WaitForTarget(3200);
     if targetpresent then
     begin
     UOSay(Chr(39)+'craftcreate 1' );
     sd:=Findtype(Logs,BackPack);
     if sd <> 0 then
     begin
     //AddToSystemJournal('Делаем горжетку...' );
     TargetToObject(sd);
     WaitMenu ('Tinkering','Other Tools');
     wait(50);
     WaitMenu ('Other Tools','(9)');
     wait(3000);
       if MenuHookPresent() = True then CancelMenu();
     end;
     end;
     end;
     FindTypeEx(Katana,-1,BackPack,true);
     Useobject(finditem);
     WaitForTarget(3200);
     if targetpresent then
     begin 
     UOSay(Chr(39)+'craftcreate 0' );
     sd:=Findtype(Logs,BackPack);
     if sd <> 0 then
     begin
     //AddToSystemJournal('Делаем горжетку...' );
     TargetToObject(sd);
     WaitMenu ('Blacksmithing','Armor');
     wait(50);
     WaitMenu ('Armor','Plate Mail');
     wait(50);
     WaitMenu ( 'Plate Mail','(0)');
     wait(3000);
       if MenuHookPresent() = True then CancelMenu();
     end;
     sd:=Findtype(Logs,BackPack);
     if (sd = 0) or (Count(Logs) < 100) then
     begin
     AddToSystemJournal('Зкончились инготы...' ); 
     BSCraft;
     end;
     end; 
  end;
  wait(5000);
   if FindType($097B, backpack) > 0 THEN
    begin
    AddToSystemJournal('Кушаем...' );
    UseObject(finditem);
    wait(3000);
    end;
    Disconnect;
    wait(3000);
 UOSay(Chr(39)+'Resend' );
 AddToSystemJournal('Ресенд...');
 wait(8000);    
 End;    
End.