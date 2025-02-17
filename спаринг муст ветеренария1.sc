 //////////////////////////>>>Тестовая версия<<</////////////////////////////////
 /////////////////////////////Skype LIHACH2003///////////////////////////////////
 /////////////////////////////ICQ 262489116//////////////////////////////////////
 /////////////////////////////email lihachtetan@rambler.ru///////////////////////
 /////////////////////////////2.0 Sparing  Shard Age of Power////////////////////
 /////////////////////////////Forged by LIHACH///////////////////////////////////
 ////////////////////////////////////////////////////////////////////////////////
 ////////////////////////////////////////////////////////////////////////////////
 ///////////////////////////Настройка Скрипта:///////////////////////////////////
 //В сундук кладете фишстейки щиты и оружиеи зашрикованные животные банки ГХ.  //
 //В рюкзак кладете бинты.                                                     //
 //Если убьет жывотное разшринкует новое и отрелизит.                          //
 //можно стоть практически с любой живкой в спаринге качать боевые             //
 //и паралельно изучать стоячие скиллы.                                        //
 //или стоять в хайде и хилять живку помогать основному чару                   //
 // который стоит в спаринге                                                   //
 ////////////////////////////////////////////////////////////////////////////////
program Sparing;

var
  Pickaxe, Horse: cardinal;
  t,MyHP: integer;
  AttackID, Hidingself: boolean; 
  //////////////////////////////////////////////////////////////////////////////
  //////////////////////////////////////////////////////////////////////////////
const                                                                         //
  PackKirka = $0E79;    // Type Сундука ;                                     //
  BoxBig = $6AC9570E;   // Указываем ID Сундука ;                             //
  Dagger = $FFF0;       // Тип оружия который будет брать в руки;             //
  Must = $00C8;         // Тип животного с которым стоим в спаринге;          //
  healself = 80;        //лечит себя если (fullHP - healself);                //
  shrink = $2121;       //Type зашринковоного жывотного;                      //
  EnemyLowHP = 40;      //минимальная ХП животного в процентах;               //
  THidingself = False;  //True становиться в Хайд;                            //
  TAttackID = True;     //True атаковать животного;                           //
  //////////////////////////////////////////////////////////////////////////////
  MoveStartX = 1007;    //координаты возле сундука X;                         //
  MoveStartY = 2550;    //координаты возле сундука Y                          //
  MoveFinishX = 1005;   //координаты возле животного X                        //
  MoveFinishY = 2550;   //координаты возле животного Y                        // 
 ///////////////////////////////////////////////////////////////////////////////
  procedure HitsStamina();                                                    //
  begin                                                                       //
    ////////////////////////////////////////////////////////////////////////////
    //проверка наличия катаны и щита;                                         //
    ////////////////////////////////////////////////////////////////////////////
    if Str > 40 then
    begin
      if ObjAtLayer(RhandLayer) = 0 then
      begin
        if FindType(Dagger, BackPack) > 0 then
        begin
          FindType(Dagger, BackPack);
          Equip(RhandLayer, finditem);
          wait(300);
        end;
        if ObjAtLayer(LhandLayer) = 0 then
        begin
          if FindType(Dagger, BackPack) = 0 then
          begin
            if FindType(Dagger, BoxBig) > 0 then
            begin
              FindType(Dagger, BoxBig);
              Equip(RhandLayer, finditem);
              wait(300);
              AddToSystemJournal('Берем в руки ножик!!!');
            end;
          end;
        end;
      end;
    end;
    ////////////////////////////////////////////////////////////////////////////
    if Str > 119 then
    begin
      if ObjAtLayer(LhandLayer) = 0 then
      begin
        if FindType($1B76, BackPack) > 0 then
        begin
          Equip(LhandLayer, finditem);
          FindType($1B76, BackPack);
          Equip(LhandLayer, finditem);
          wait(300);
        end;
        if ObjAtLayer(LhandLayer) = 0 then
        begin
          if FindType($1B76, BackPack) = 0 then
          begin
            if FindType($1B76, BoxBig) > 0 then
            begin
              FindType($1B76, BoxBig);
              Equip(LhandLayer, finditem);
              AddToSystemJournal('Берем в руки Щит!!!');
              wait(300);
            end;
          end;
        end;
      end;
    end;
    ////////////////////////////////////////////////////////////////////////////
    if Str > 79 then
    begin
      if ObjAtLayer(LhandLayer) = 0 then
      begin
        if FindType($1B74, BackPack) > 0 then
        begin
          Equip(LhandLayer, finditem);
          FindType($1B74, BackPack);
          Equip(LhandLayer, finditem);
          wait(300);
        end;
        if ObjAtLayer(LhandLayer) = 0 then
        begin
          if FindType($1B74, BackPack) = 0 then
          begin
            if FindType($1B74, BoxBig) > 0 then
            begin
              FindType($1B74, BoxBig);
              Equip(LhandLayer, finditem);
              AddToSystemJournal('Берем в руки Щит!!!');
              wait(300);
            end;
          end;
        end;
      end;
    end;
    
        if FindType($0E21, Backpack) = 0 then
        begin
          FindType($0E21, BoxBig);
          UseObject(Backpack); //Ёткрываем ?юкзак;
          wait(500);
          AddToSystemJournal('Ъерем бинты!!!');
          wait(350);
          grab(finditem, 50);
        end;
    
    
  end;


  procedure MyHits();
  begin 
      if Hidingself = False then
      begin
        FindDistance := 5;
        if FindType(Must, ground) = 0 then
        begin
          NewMoveXY(MoveFinishX, MoveFinishY, False, 0, False);
          HitsStamina;
          if FindType(shrink, BoxBig) > 0 then
          begin
            UseObject(Finditem);
            wait(3000);
            if Hidingself = False then
              UOSay('all release');
          end;
        end;
      end;
    repeat
      if (Life < (MaxLife - healself)) then
      begin
        AddToSystemJournal('Востанавливаем Здоровья |||');
        if (Life <= 60) then
        begin
          if FindType($0F0C, Backpack) <> 0 then
          begin
            AddToSystemJournal('Здоровья чара>>>>>>>>>: ' + IntToStr(Life));
            AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));
            UOSay(Chr(39) + 'pc quaf heal');
            AddToSystemJournal('|||||||||||||||||||||||||||');
          end;
          AddToSystemJournal('Здоровья чара>>>>>>>>>: ' + IntToStr(Life));
          AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));
          UOSay(Chr(39) + 'pc heal self');
          AddToSystemJournal('|||||||||||||||||||||||||||');
        end;
        if (Life > 60) then
          wait(350);
        begin
          AddToSystemJournal('Здоровья чара>>>>>>>>>: ' + IntToStr(Life));
          AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));
          UOSay(Chr(39) + 'pc heal self');
          AddToSystemJournal('|||||||||||||||||||||||||||');
        end;
      end;
      for t := 1 to 16 do
      begin
        wait(500);
        HitsStamina;
        if Hidingself = False then
          NewMoveXY(MoveStartX, MoveStartY, False, 0, False);
        if (Life = Maxlife) then
          Break;
      end;
    until (Life >= (MaxLife - healself)) or (FindType($0E21, Backpack) = 0);
    repeat
      if (Life >= (MaxLife - healself)) then
      begin
        if Hidingself = False then
          NewMoveXY(MoveStartX, MoveStartY, False, 0, False);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        FindVertical := 15;
        FindDistance := 5;
        Horse := FindType(Must, ground);
        if Horse > 0 then
        begin
          if FindType($0E21, Backpack) <> 0 then
          begin
            Pickaxe := FindType($0E21, Backpack);
            useobject(Pickaxe);
            WaitForTarget(100);
            AddToSystemJournal('Хиляем Животное');
          end;
          if targetpresent then
          begin
            TargetToObject(Horse);
          end;

          for t := 1 to 16 do
          begin
            wait(500);
            HitsStamina;
            if Hidingself = False then
              NewMoveXY(MoveStartX, MoveStartY, False, 0, False);
            if GetHP(Horse) > 99 then
              Break;
          end;
        end;
      end;
    until (GetHP(Horse) > 99) or (Horse = 0) or (FindType($0E21, Backpack) = 0);
  end;


////////////////////////////////////////////////////////////////////////////////
///////////////////////Oсновная программа;//////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Begin
////////////////////////////////////////////////////////////////////////////////
///////////////////////////игнор лист///////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
ignore($0886225A);//вписываете свое ID.                                       //
ignore($00000000);//вписываем своё ID или кого игнорить.                      //
ignore($00000000);//вписываем своё ID или кого игнорить.                      //
ignore($00000000);//вписываем своё ID или кого игнорить.                      //
ignore($00000000);//вписываем своё ID или кого игнорить.                      //
ignore($00000000);//вписываем своё ID или кого игнорить.                      //
////////////////////////////////////////////////////////////////////////////////
  Hidingself := THidingself;     
  AttackID := TAttackID;                      
  HitsStamina;
  while True do
  begin
    for t := 1 to 29 do
    begin
    wait(500);
    HitsStamina;
      if not Hidden then
      begin
        if Hidingself = True then
          useskill('Hiding');
      end;
      AddToSystemJournal('Кушать будем когда 30=: ' + IntToStr(t));
      MyHP := Maxlife - healself;
      if GetHP(Horse) < 100 then
      begin
        FindVertical := 15;
        FindDistance := 5;
        Horse := FindType(Must, ground);
        if Horse > 0 then
        begin
          if FindType($0E21, Backpack) <> 0 then
          begin
            Pickaxe := FindType($0E21, Backpack);
            useobject(Pickaxe);
            WaitForTarget(100);
            AddToSystemJournal('Хиляем Животное');
          end;
          if targetpresent then
          begin
            TargetToObject(Horse);
          end;
        end;
      end
      else
      begin
        AddToSystemJournal('Востанавливаем Здоровья |||');
        if (Life <= 60) then
        begin
          if FindType($0F0C, Backpack) <> 0 then
          begin
            AddToSystemJournal('Здоровья чара>>>>>>>>>: ' + IntToStr(Life));
            AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));
            UOSay(Chr(39) + 'pc quaf heal');
            AddToSystemJournal('|||||||||||||||||||||||||||');
          end;
          AddToSystemJournal('Здоровья чара>>>>>>>>>: ' + IntToStr(Life));
          AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));
          UOSay(Chr(39) + 'pc heal self');
          AddToSystemJournal('|||||||||||||||||||||||||||');
        end;
        if (Life > 60) then
          wait(350);
        begin
          AddToSystemJournal('Здоровья чара>>>>>>>>>: ' + IntToStr(Life));
          AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));
          UOSay(Chr(39) + 'pc heal self');
          AddToSystemJournal('|||||||||||||||||||||||||||');
        end;
      end;

      for t := 1 to 16 do
      begin
        if (GetHP(Horse) < EnemyLowHP) or (GetHP(Self) < MyHP) then
        begin
          MyHits();
        end
        else
        begin
          if Hidingself = False then
            NewMoveXY(MoveFinishX, MoveFinishY, False, 0, False);
          if AttackID = True then
            Attack(Horse);
          wait(500);
          HitsStamina;
        end;
      end;
    end;
    if FindType($097B, BoxBig) > 0 THEN
    begin
    NewMoveXY(MoveStartX, MoveStartY, False, 0, False);
    wait(8100);
    AddToSystemJournal('Кушаем фишстейки!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
  end;
end.
