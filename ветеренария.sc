//////////////////////////>>>Тестовая версия<<</////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////////1.5 Sparing  Shard Age of Power////////////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
///////////////////////////Настройка Скрипта:///////////////////////////////////
//В сундук кладете фишстейки щиты и оружиеи зашрикованные животные банки ГХ.
//В рюкзак кладете бинты.
//Если убьет жывотное разшринкует новое и отрелизит.
Program Sparing;
var Pickaxe, Corpse :Cardinal;
    t,MyHP:Integer;
    AttackID:Boolean;
const
PackKirka=$0E7D;// Type Сундука ;
BoxBig= $7163D2C9; // Указываем ID Сундука ;
Dagger= $0EC4; // Тип оружия который будет брать в руки;
Must=  $00C8; // Тип животного с которым стоим в спаринге;
healself= 20; //лечит себя если (fullHP - healself) 
 Procedure HitsStamina(); 
 var DaggerID:Cardinal;    
 begin   
  repeat
  FindDistance := 6;
  IF FindType(PackKirka, ground) = 0 THEN
  Begin
  UOSay(Chr(39)+'resend' );
  wait(6000)
  end;
  if BoxBig <> finditem then ignore(finditem);
  until BoxBig = finditem;
  
        //проверка наличия катаны и щита;
    if Str > 40 then
    begin
    if ObjAtLayer(RhandLayer) = 0 then
    begin
    if FindType(Dagger, BackPack) > 0 THEN
    begin
    FindType(Dagger, BackPack);  
    Equip(RhandLayer, finditem);
    wait (600);
    end;
    ////////////////////////////////////// 
    if ObjAtLayer(LhandLayer) = 0 then
    begin
    if FindType(Dagger, BackPack) = 0 THEN
    begin 
    if FindType(Dagger,BoxBig) > 0 THEN
    begin
    DaggerID:=FindType(Dagger, BoxBig);  
    Equip(RhandLayer, DaggerID);
    wait (300); 
    AddToSystemJournal('Берем в руки ножик!!!');
    end;
    end;
    end;
    /////////////////////////////////////////
    end;
    end;
 
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
    wait (600);
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
    if (Life > 80) then
    begin
    NewMoveXY(1408, 2816, false, 0, True );
    end;
    UseObject(Backpack); //Открываем Рюкзак;
    wait(500);
    UseObject(BoxBig);
    wait(500);
    if Count($0E21) < 100 THEN
    begin
    if FindType($0E21, BoxBig) <> 0 THEN
     begin
     wait(500);
     grab(finditem,100);
     end;
     end;
  
   if FindType( $0E21, Backpack) <> 0 THEN
    begin  
    if Life <= MyHP  then 
    begin
    if (Life <= 69) then 
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
    wait(1000);
    end;
    if (Life > 70) then wait (350);
    begin
    AddToSystemJournal('Здоровье чара>>>>>>>>>: ' + IntToStr(Life));
    AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));     
    UOSay(Chr(39)+'pc heal self' );
    wait(1000);
    end;
    if (Life < 70) then                                                
    begin 
    repeat                                                              
    AddToSystemJournal('Количество здоровья критическое');
    AddToSystemJournal('Здоровье чара>>>>>>>>>: ' + IntToStr(Life));
    AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));     
    UOSay(Chr(39)+'pc heal self' );
    NewMoveXY(2242, 893, false, 0, True );
    wait(1000);
    //координата отходим на отхил; 
    until Life = Maxlife;
    wait(9000);
   end;  
 end;
 end;
 
 if FindType( $0E21, Backpack) <> 0 THEN
    begin
 if GetHP(lastattack) < 30  then                                                
    begin 
     repeat                                                              
     NewMoveXY(2242, 893, false, 0, True );
     //координата отходим на отхил;       
       FindDistance := 6;
        Corpse:=FindType(Must ,ground);
        if Corpse > 0 then
            begin
            if FindType($0E21, Backpack) > 0 THEN  
                 begin
                    If TargetPresent Then CancelTarget;
                    begin
                    Pickaxe:=FindType($0E21, Backpack); 
                    useobject(Pickaxe);
                    WaitForTarget(3000);
                    AddToSystemJournal('Хиляем Животное');
                    end;
                 end;
                    if targetpresent then
                    begin
                    TargetToObject(Corpse);
                    end;
                    wait(1000);      
            end;
    
    until GetHP(lastattack) = GetMaxHP(lastattack);
    wait(9000);  
    end;
   end; 
     
 end;

Begin
    MoveThroughNPC:=(0);//Если задан ноль, пытается пройти сквозь чара ;
    ignore($55863C07);//вписываете свое ID.
    NewMoveXY(1409, 2816, false, 0, True );
    UseObject(Backpack); //Открываем Рюкзак;
    ///////////////////////////////////////////////////////
    wait(100);
    UseObject(BoxBig);
    wait(100);
    HitsStamina;
    while true do
begin
 for t:=1 to 120 do
  begin
    AddToSystemJournal('Кушать будем когда 120=: ' + IntToStr(t));
    UseObject(Backpack); //Открываем Рюкзак;
    wait(100);
    UseObject(BoxBig);
    wait(100);
    HitsStamina;
    MyHits;
    MyHP:= Maxlife - healself ;      
    if Life >= MyHP then
    begin
    FindDistance := 6;
    Corpse:=FindType(Must ,ground);
    if Corpse > 0 then
    begin
    if FindType($0E21, Backpack) > 0 THEN  
        begin
        If TargetPresent Then CancelTarget;
            begin
            Pickaxe:=FindType($0E21, Backpack); 
            useobject(Pickaxe);
            WaitForTarget(3000);
            AddToSystemJournal('Хиляем Животное');
            end;
        end;
    if targetpresent then
    begin
    TargetToObject(Corpse);
    end;
    wait(300);      
    Attack(Corpse);  
  end;    
 end;
 end;
    NewMoveXY(1407, 2815, false, 0, True );
    wait(9000);
    UseObject(Backpack); //Открываем Рюкзак;
    ///////////////////////////////////////////////////////
    wait(100);
    UseObject(BoxBig);
    wait(1000);
    if FindType($097B, BoxBig) > 0 THEN
    begin
    AddToSystemJournal('Кушаем фишстейки!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end; 
end;
End.