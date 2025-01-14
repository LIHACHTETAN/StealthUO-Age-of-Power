////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////////1.1 BScraft Shard Age of Power/////////////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
//В сундук кладём руду , фишстейки.Рядом должен находиться горн.................
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program BScraft;
Var sd,i: Integer;
Const
BoxBig= 'Backpack'; //Сундук с срудой ID;
Ruda= $19B9; //Tип Руды;
Kolichestvo= 1; // Количество руды для переплавки;
Begin
 while true do
 Begin
 for i:=1 to 30 do
  begin
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> При 30 будем кушать... ||');
  Useobject(BoxBig);
  UseObject(Backpack); //Открываем Рюкзак;
  FindDistance :=10;
  Findtype(Ruda,BoxBig);
   if FindFullQuantity > 0 then
    begin
    AddToSystemJournal('|||||||||||||||||||||||||||||||||||' );
    AddToSystemJournal('Берём Руду...                    ||' );
    grab(finditem,Kolichestvo);
    wait(100);
    end;
    Useobject(BoxBig);
    UseObject(Backpack); //Открываем Рюкзак;
    repeat
    Findtype(Ruda,BackPack);
    if FindFullQuantity > 0 then
    begin
     Useobject(finditem);
     WaitForTarget(3000);
     if targetpresent then
     begin
     FindVertical:=15;
     FindDistance :=7;
     Findtype($0FB1,Ground);
     AddToSystemJournal('Плавим...                      ||' );
     TargetToObject(finditem); 
     //задержка на использование;
     wait(3000);
     end;
   end;
   Findtype(Ruda,BackPack);
   until FindItem = 0  
  end; 
   if FindType($097B, BoxBig) > 0 THEN
    begin
    AddToSystemJournal('Кушаем...                       ||' );
    UseObject(finditem);
    wait(3000);
    end;
 UOSay(Chr(39)+'Resend' );
 AddToSystemJournal('Ресенд...                        || ');
 wait(8000);    
 End;    
End.