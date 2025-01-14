//////////////////////////>>>Тестовая версия<<</////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////////1.7 Sparing  Shard Age of Power////////////////////
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
Program Sparing;
var Pickaxe, Corpse :Cardinal;
    t,MyHP:Integer;
    AttackID, Hidingself:Boolean;
    skill_use_hileaning: String;
const
PackKirka=$0E7D;// Type Сундука ;
BoxBig= $7163D2C9; // Указываем ID Сундука ;
Dagger= $0F51; // Тип оружия который будет брать в руки;
Must= $00C8; // Тип животного с которым стоим в спаринге;
healself= 60; //лечит себя если (fullHP - healself)
shrink= $2121;//Type зашринковоного жывотного.
 Procedure HitsStamina();
   var fh: Integer;
    begin
  repeat
  FindDistance := 3;
  IF FindType(PackKirka, ground) = 0 THEN
  Begin
  UOSay(Chr(39)+'resend' );
  wait(6000)
  end;
  if BoxBig <> finditem then ignore(finditem);
  until BoxBig = finditem;
  /////////////////////////////////////////////////////////////
     //проверка наличия катаны и щита;
    if Str > 40 then
    begin
    if ObjAtLayer(RhandLayer) = 0 then
    begin
    if FindType(Dagger, BackPack) > 0 THEN
    begin
    FindType(Dagger, BackPack);
    Equip(RhandLayer, finditem);
    wait (300);
    end;
    if ObjAtLayer(LhandLayer) = 0 then
    begin
    if FindType(Dagger, BackPack) = 0 THEN
    begin
    if FindType(Dagger, BoxBig) > 0 THEN
    begin
    FindType(Dagger, BoxBig);
    Equip(RhandLayer, finditem);
    wait (300);
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
    if FindType($1B76, BackPack) > 0 THEN
    begin
    Equip(LhandLayer, finditem);
    FindType($1B76, BackPack);
    Equip(LhandLayer, finditem);
    wait (300);
    end;
    if ObjAtLayer(LhandLayer) = 0 then
    begin
    if FindType($1B76, BackPack) = 0 THEN
    begin
    if FindType($1B76, BoxBig) > 0 THEN
    begin
    FindType($1B76, BoxBig);
    Equip(LhandLayer, finditem);
    AddToSystemJournal('Берем в руки Щит!!!');
    wait (300);
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
    if FindType($1B74, BackPack) > 0 THEN
    begin
    Equip(LhandLayer, finditem);
    FindType($1B74, BackPack);
    Equip(LhandLayer, finditem);
    wait (300);
    end;
    if ObjAtLayer(LhandLayer) = 0 then
    begin
    if FindType($1B74, BackPack) = 0 THEN
    begin
    if FindType($1B74, BoxBig) > 0 THEN
    begin
    FindType($1B74, BoxBig);
    Equip(LhandLayer, finditem);
    AddToSystemJournal('Берем в руки Щит!!!');
    wait (300);
    end;
    end;
    end;
    end;
    end;
end;


Procedure MyHits();
    begin
    UseObject(Backpack); //Открываем Рюкзак;
    wait(100);
    UseObject(BoxBig);
    wait(100);
    if Life <= MyHP  then
    begin
    if (Life <= 50) then
    begin
    if FindType( $0F0C, Backpack) <> 0 THEN
    begin
    AddToSystemJournal('Здоровье чара>>>>>>>>>: ' + IntToStr(Life));
    AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));
    UOSay(Chr(39)+'pc quaf heal' );
    end;
    AddToSystemJournal('Здоровье чара>>>>>>>>>: ' + IntToStr(Life));
    AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));
    UOSay(Chr(39)+'pc heal self' );
    end;
    if (Life > 60) then wait (350);
    begin
    AddToSystemJournal('Здоровье чара>>>>>>>>>: ' + IntToStr(Life));
    AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));
    UOSay(Chr(39)+'pc heal self' );
    end;
    end;
    if Stam < 100 THEN
    begin
    UOSay(Chr(39)+'pc quaf refresh' );
    end;
end;


Begin
ignore($05D5A356);//вписываете свое ID.
Hidingself:= false;//true становиться в хайдеслипросто хил нужен живке.
AttackID:= true;//true атакует,false нет.
UseObject(Backpack); //Открываем Рюкзак;
skill_use_hileaning:= 'Animal Lore';//Изучение паролельного умения;
 ///////////////////////////////////////////////////////
 wait(100);
 UseObject(BoxBig);
 wait(100);
 HitsStamina;
 while true do
 begin
 for t:=0 to 27 do
 begin
 if not Hidden then
 begin
 if Hidingself = true then useskill('Hiding');
 end;
 AddToSystemJournal('Кушать будем когда 27=: ' + IntToStr(t));
 UseObject(Backpack); //Открываем Рюкзак;
 wait(100);
 UseObject(BoxBig);
 wait(100);
 MyHits;
 MyHP:= Maxlife - healself ;
 if Life >= MyHP then
    begin
    FindDistance := 4;
    Corpse:=FindType(Must ,ground);
    if Corpse > 0 then
    begin
    if Hidingself = false then useskill(skill_use_hileaning);
    if targetpresent then
    begin
    WaitForTarget(3000);
    TargetToObject(Corpse);
    end;
    if FindType($0E21, Backpack) > 0 THEN
        begin
        If TargetPresent Then CancelTarget;
            Pickaxe:=FindType($0E21, Backpack);
            useobject(Pickaxe);
            WaitForTarget(100);
            AddToSystemJournal('Хиляем Животное');
        end;
    if targetpresent then
    begin
    TargetToObject(Corpse);
    end;
    HitsStamina;
 if AttackID = true then Attack(Corpse);
 end;
 end;
 end;
 UseObject(Backpack); //Открываем Рюкзак;
 wait(100);
 UseObject(BoxBig);
 wait(100);
 HitsStamina;
 FindDistance := 15;
 if FindType(Must, ground) = 0 THEN
    begin
     if FindType(shrink, BoxBig) > 0 THEN
     begin
     UseObject(finditem);
     wait(3100);
     if Hidingself = false then UOSay('all release' );
     end;
    end;
 if FindType($097B, BoxBig) > 0 THEN
    begin
    wait(8500);
    AddToSystemJournal('Кушаем фишстейки!!! 30=:' + IntToStr(t));
    UseObject(finditem);
    wait(600);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
    if Hidingself = false then UOSay('all release' );
 end;
End.