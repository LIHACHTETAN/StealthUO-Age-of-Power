////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////////1.1 BScraft include Shard Age of Power/////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
//В сундук кладём руду , фишстейки.Рядом должен находиться горн.................
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Procedure BScraft;
Var i: Integer; 
Begin
 for i:=1 to 10 do
  begin
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> При 30 будем кушать... ||');
  Useobject(BoxBig);
  UseObject(Backpack); //Открываем Рюкзак;
  FindDistance := 10;
  Findtype(Ruda,BoxBig);
   if FindFullQuantity > 0 then
    begin
    AddToSystemJournal('|||||||||||||||||||||||||||||||||||' );
    AddToSystemJournal('Берём Руду...                    ||' );
    grab(finditem,Kolichestvo);
    wait(100);
    end; 
    UseObject(Backpack); //Открываем Рюкзак;
    Useobject(BoxBig);
    repeat
    Findtype(Ruda,BackPack);
    if FindFullQuantity > 0 then
    begin
     Useobject(finditem);
     WaitForTarget(3000);
     if targetpresent then
     begin
     AddToSystemJournal('Плавим...                      ||' );
     TargetToObject(Stanok); 
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
 Disconnect;
 UOSay(Chr(39)+'Resend' );
 AddToSystemJournal('Ресенд...                        || ');
 wait(8000);        
End;