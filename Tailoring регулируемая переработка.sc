////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////////3.1 Tailoring Shard Age of Power///////////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
//В сундук кладём котон или катушки , фишстейки.Рядом должен находиться станок.
//Запускаем скрипт с котона сначала будет катушки , ну и с катушек будет делать
//рулоны и класть назад в сундук. Вот как бы и всё удачной прокачки !!!/////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program Tailoring;
Var sd,i: Integer;
Const
BoxBig= $651544C1; //Сундук с хлопком;
Cotton= $0DF9; //Tип хлопка;
Spool= $0FA0; //Тип катушек;
Stanok= $652171DF; //Станок;
/////////////////////////////////////////////////////////////////
//примерно ставим 6/1 если на прокачку тейлора;                //
//typeid= 6;                                                   //
//typeiditem= 1;                                               //
/////////////////////////////////////////////////////////      //
/////////////////////////////////////////////////////////      //
//примерно ставим 60/60 если просто сделать ткань;     //      //
//typeid= 60;                                          //      //
//typeiditem= 60;                                      //      //
/////////////////////////////////////////////////////////      //
typeid= 60;                                                    //
typeiditem= 60;                                                //
/////////////////////////////////////////////////////////////////
Begin
 while true do
 Begin
 for i:=1 to 30 do
  begin
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> При 30 будем кушать... ||');
  Useobject(BoxBig);
  UseObject(Backpack); //Открываем Рюкзак;
  FindDistance := 10;
  Findtype($0DF9,BoxBig);
   if FindFullQuantity > 0 then
    begin
    AddToSystemJournal('|||||||||||||||||||||||||||||||||||' );
    AddToSystemJournal('Берём хлопок...                  ||' );
    grab(finditem,typeiditem);
    wait(100);
    end;
    Useobject(BoxBig);
    UseObject(Backpack); //Открываем Рюкзак;
    Findtype($0DF9,BackPack);
    if FindFullQuantity > 0 then
    begin
     Useobject(finditem);
     WaitForTarget(3000);
     if targetpresent then
     begin
     AddToSystemJournal('Сделали Катушку...               ||' );
     TargetToObject(Stanok); 
     //задержка на использование;
     wait(3000);
     end;
     if  Findtype($0DF9,BackPack)>= typeid then
     begin
     AddToSystemJournal('Перекладываем катушки в сундук...||' );
     AddToSystemJournal('|||||||||||||||||||||||||||||||||||' );
     MoveItem(FindItem,0,BoxBig,0,0,0);
     wait(300);
     end;
   end;  
  FindDistance := 10;
  Findtype($0FA0,BoxBig);
   if FindFullQuantity >= typeid then
   begin
   AddToSystemJournal('Берём катушки...                  ||');
   grab(finditem,typeid);
   wait(100);
   end;
    Useobject(BoxBig);
    UseObject(Backpack); //Открываем Рюкзак;
     Findtype($0FA0,BackPack);
     if FindFullQuantity >= typeid then
     begin
     Useobject(finditem);
     WaitForTarget(3000);
      if targetpresent then
      begin
      TargetToObject(Stanok);
      AddToSystemJournal('Сделали рулон...                 ||' );
      //задержка на использование;
      wait(3000);
      end;
     end;
    if  Findtype($0F95,BackPack)> 0 then
    begin
    AddToSystemJournal('Перекладываем рулон в сундук...  ||' );
    AddToSystemJournal('|||||||||||||||||||||||||||||||||||' );
    MoveItem(FindItem,0,BoxBig,0,0,0);
    wait(300);
    end;
  end; 
   if FindType($097B, BoxBig) > 0 THEN
    begin
    AddToSystemJournal('Кушаем...                        ||' );
    UseObject(finditem);
    wait(3000);
    end;
 UOSay(Chr(39)+'Resend' );
 AddToSystemJournal('Ресенд...                        || ');
 wait(8000);    
 End;    
End.