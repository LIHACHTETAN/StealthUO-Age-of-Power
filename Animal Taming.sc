//////////////////////////>>>Тестовая версия<<</////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
////////////////////////1.0.0 Animal Taming Shard Age of Power//////////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program Animal;
var Pickaxe, Corpse :Cardinal;
    x1, x2, x3,x4 ,t, MyHP :Integer;
    Armor,Murder :Boolean;
const
//сундуки для работы с скриптом;
BoxBig= $6BCE6257; // Указываем ID основного Сундука;
BoxBan= $6BFF4ADD; // Указываем ID Сундука для Бинтиков,Банок; 
BoxArm= $5BDA4447; // Указываем ID Сундука для армора ;
BoxHit= $68EDDED1; // Указываем ID Сундука для Щитов;
HouseX= 6080;
HouseY= 2993;
HealerX=6080;
HealerY=2997;
Krest=$4D3CABFB;
// первая координата;
HealerX2=6105;
HealerY2=2923;
// вторая координата;
HealerX1=6107;
HealerY1=2922;  
Must= $003D; // Тип животного которого приручаем 003D-Дрейк, 00DA-зост;   
Procedure HitsStamina(); 
   var fh: Integer;
       Band: Cardinal;
    begin
    fh:= 1;
   repeat
    repeat
    if Str > 119 then
    begin
       if Dead = true then
       begin
        Disconnect;
        repeat
        NewMoveXY(HealerX, HealerY, false, 0, true );
        if Murder = true  then
        begin
        useobject(Krest);
        wait(3000);
        end;          
        until Dead = false
       end;        
    if ObjAtLayer(LhandLayer) = 0 then
    begin
    NewMoveXY(HouseX, HouseY, false, 1, true );
    wait(100);
    UseObject(Backpack); //Открываем Рюкзак;
    wait(100);
    UseObject(BoxBig);
    wait(100);
    UseObject(BoxHit);
    wait(100); 
    if FindType($1B76, BoxHit) > 0 THEN
    begin
    FindType($1B76, BoxHit);
    wait (350);   
    Equip(LhandLayer, finditem);
    AddToSystemJournal('Берем с сундука Щит!!!');
    end;
    end;
    end;
    //////////////////////////////////////////////////////////////////////////// 
    if Str > 79 then
    begin 
    if Dead = true then
    begin
    Disconnect;
    repeat
    NewMoveXY(HealerX, HealerY, false, 0, true );
    if Murder = true  then
    begin
    useobject(Krest);
    wait(3000);
    end;          
    until Dead = false
    end;       
    if ObjAtLayer(LhandLayer) = 0 then
    begin
    NewMoveXY(HouseX, HouseY, false, 1, true );
    wait(100);
    UseObject(Backpack); //Открываем Рюкзак;
    wait(100);
    UseObject(BoxBig);
    wait(100);
    UseObject(BoxHit);
    wait(100); 
    if FindType($1B74, BoxHit) > 0 THEN
    begin
    FindType($1B74, BoxHit);
    wait (350);   
    Equip(LhandLayer, finditem);
    AddToSystemJournal('Берем с сундука Щит!!!');
    end;
    end;
    end;
    //////////////////////////////////////////////////////////////////////////// 
    if Dead = true then
    begin
    Disconnect;
    repeat
    NewMoveXY(HealerX, HealerY, false, 0, true );
    if Murder = true  then
    begin
    useobject(Krest);
    wait(3000);
    end;          
    until Dead = false
    end;       
    if FindType($3FF8, BackPack) > 0 THEN
    begin
    FindType($3FF8, BackPack);
    wait (100);   
    Useobject(finditem);
    AddToSystemJournal('Одеваем плащь!!!');
    wait(3000);
    end;  
    ////////////////////////////////////////////////////////////////////////////                
    ////////////////////////////////////////////////////////////////////////////
    /////////////////////Dress//////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    // Одеваем перчатки плейт;
    if Armor = true THEN
    begin
    if Str > 119 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(GlovesLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($1414, BoxArm) > 0 THEN
            begin
            FindType($1414, BoxArm);
            wait (350);   
            Equip(GlovesLayer, finditem);
            AddToSystemJournal('Одеваем перчатки!!!');
            end;
        end;                
    end;
    
   // Одеваем головной убор плейт;
    if Str > 119 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(HatLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($1412, BoxArm) > 0 THEN
            begin
            FindType($1412, BoxArm);
            wait (350);   
            Equip(HatLayer, finditem);
            AddToSystemJournal('Одеваем головной убор!!!');
            end;
        end;                
    end; 
    
   // Одеваем штаны плейт;
    if Str > 119 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(LegsLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($141A, BoxArm) > 0 THEN
            begin
            FindType($141A, BoxArm);
            wait (350);   
            Equip(LegsLayer, finditem);
            AddToSystemJournal('Одеваем штаны!!!');
            end;
        end;                
    end;
   
   // Одеваем нагрудник плейт;
    if Str > 119 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(TorsoLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($1416 , BoxArm) > 0 THEN
            begin
            FindType($1416 , BoxArm);
            wait (350);   
            Equip(TorsoLayer, finditem);
            AddToSystemJournal('Одеваем нагрудник!!!');
            end;
        end;                
    end;      
    
   // Одеваем горжетку плейт;
    if Str > 119 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(NeckLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($1413, BoxArm) > 0 THEN
            begin
            FindType($1413, BoxArm);
            wait (350);   
            Equip(NeckLayer, finditem);
            AddToSystemJournal('Одеваем горжетку!!!');
            end;
        end;                
    end;
    
   // Одеваем локти плейт;
    if Str > 119 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(ArmsLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($1410, BoxArm) > 0 THEN
            begin
            FindType($1410, BoxArm);
            wait (350);   
            Equip(ArmsLayer, finditem);
            AddToSystemJournal('Одеваем локти!!!');
            end;
        end;                
    end;  
    
    // Одеваем перчатки чейн;
    if Str > 79 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(GlovesLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($13F2, BoxArm) > 0 THEN
            begin
            FindType($13F2, BoxArm);
            wait (350);   
            Equip(GlovesLayer, finditem);
            AddToSystemJournal('Одеваем перчатки!!!');
            end;
        end;                
    end;
    ////////////////////////////////////////////////////////////////////////////    
    // Одеваем головной убор;
    if Str > 79 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(HatLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($13BB, BoxArm) > 0 THEN
            begin
            FindType($13BB, BoxArm);
            wait (350);   
            Equip(HatLayer, finditem);
            AddToSystemJournal('Одеваем головной убор!!!');
            end;
        end;                
    end;
    ////////////////////////////////////////////////////////////////////////    
    // Одеваем штаны;
    if Str > 79 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(PantsLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($13C3, BoxArm) > 0 THEN
            begin
            FindType($13C3, BoxArm);
            wait (350);   
            Equip(PantsLayer, finditem);
            AddToSystemJournal('Одеваем штаны!!!');
            end;
        end;                
    end;

    ////////////////////////////////////////////////////////////////////////////
    // Одеваем сапоги;
    if Str > 79 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(ShoesLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($1711, BoxArm) > 0 THEN
            begin
            FindType($1711, BoxArm);
            wait (350);   
            Equip(ShoesLayer, finditem);
            AddToSystemJournal('Одеваем сапоги!!!');
            end;
        end;                
    end;
  
////////////////////////////////////////////////////////////////////////////
    // Одеваем нагрудник;
    if Str > 79 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(TorsoLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($13C4 , BoxArm) > 0 THEN
            begin
            FindType($13C4 , BoxArm);
            wait (350);   
            Equip(TorsoLayer, finditem);
            AddToSystemJournal('Одеваем нагрудник!!!');
            end;
        end;                
    end;      
    ////////////////////////////////////////////////////////////////////////////
    // Одеваем горжетку;
    if Str > 79 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(NeckLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($13D6, BoxArm) > 0 THEN
            begin
            FindType($13D6, BoxArm);
            wait (350);   
            Equip(NeckLayer, finditem);
            AddToSystemJournal('Одеваем горжетку!!!');
            end;
        end;                
    end;
    ////////////////////////////////////////////////////////////////////////////
     // Одеваем локти;
    if Str > 79 then
    begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;          
     until Dead = false
     end;
        if ObjAtLayer(ArmsLayer) = 0 then
        begin
        NewMoveXY(HouseX, HouseY, false, 1, true );
        wait(100);
        UseObject(Backpack); //Открываем Рюкзак;
        wait(100);
        UseObject(BoxBig);
        wait(100);
        UseObject(BoxArm);
        wait(100); 
            if FindType($13EF, BoxArm) > 0 THEN
            begin
            FindType($13EF, BoxArm);
            wait (350);   
            Equip(ArmsLayer, finditem);
            AddToSystemJournal('Одеваем локти!!!');
            end;
        end;                
    end;
    
 end;//конец проверки армора;
    ////////////////////////////////////////////////////////////////////////////
    //Кушаем Фишстейк; 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;                    
     until Dead = false
     end;        
    NewMoveXY(HouseX, HouseY, false, 1, true );
    wait(100);
    UseObject(Backpack); //Открываем Рюкзак;
    wait(100);
    UseObject(BoxBig);
    wait(100);
    UseObject(BoxBan);
    wait(100);
    if fh = 1 then
    begin
    if FindType($097B, BoxBan) > 0 THEN
    begin
    UseObject(finditem);
    wait(3000);
    fh:= 0;
    end;
    end;
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////// 
    //Проверка количества бинтиков в рюкзаке;
    Count(FindType($0E21, Backpack));
    if Count($0E21) < 100 then
    begin
    Band:=FindType($0E21, BoxBan);
    if Dead = true then
    begin
    Disconnect;
    repeat
    NewMoveXY(HealerX, HealerY, false, 0, true );
    if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;                     
    until Dead = false
    end;        
    NewMoveXY(HouseX, HouseY, false, 1, true );
    wait(100);
    UseObject(Backpack); //Открываем Рюкзак;
    wait(100);
    UseObject(BoxBig);
    wait(100);
    UseObject(BoxBan);
    wait(100);
    AddToSystemJournal('Берем бинты!!!');
    wait (350);
    grab(Band,100-Count($0E21));
    end;
    ////////////////////////////////////////////////////////////////////////////
    //Если HP не полное лечимся бинтами,если хп меньше 60 пьем банку;  
    if (Life < MaxLife) then
    begin
    if (Life <= 60) then
    begin
    if FindType( $0F0C, Backpack) = 0 THEN
    begin
    NewMoveXY(HouseX, HouseY, false, 1, true );
    wait(100);
    UseObject(Backpack); //Открываем Рюкзак;
    wait(100);
    UseObject(BoxBig);
    wait(100);
    UseObject(BoxBan);
    wait(100);
    if FindType($0F0C, BoxBan) > 0 THEN
    begin 
    if Dead = true then
    begin
    Disconnect;
    repeat
    NewMoveXY(HealerX, HealerY, false, 0, true );
    if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;                     
    until Dead = false
    end;
    NewMoveXY(HouseX, HouseY, false, 1, true );
    wait(100);
    UseObject(Backpack); //Открываем Рюкзак;
    wait(100);
    UseObject(BoxBig);
    wait(100);
    UseObject(BoxBan);
    wait(100);        
    FindType( $0F0C, BoxBan);
    AddToSystemJournal('Берём ГХ!!!');
    wait (350);
    grab(FindItem,1);
    end; 
    UOSay(Chr(39)+'pc heal self' );
    AddToSystemJournal('Востанавливаем Здоровье!!!');
    wait(8000);
    end;
    end;
    if (Life <= 60) then 
    begin
    if FindType( $0F0C,backpack) > 0 then
    begin
    UOSay(Chr(39)+'pc quaf heal' );
    AddToSystemJournal('Востанавливаем Здоровье,пьем хилку!!!');
    wait(8000);
    end;
    end;
    if (Life > 60) then 
    begin
    UOSay(Chr(39)+'pc heal self' );
    AddToSystemJournal('Востанавливаем Здоровье!!!');
    wait(8000);
    end; 
    end;
   

     //Берем рефреш если Stam меньше 100, и используем;
     if Stam < 100 THEN 
     begin
     NewMoveXY(HouseX, HouseY, false, 1, true );
     wait(100);
     UseObject(Backpack); //Открываем Рюкзак;
     wait(100);
     UseObject(BoxBig);
     wait(100);
     UseObject(BoxBan);
     wait(100);
     if FindType($0F0B, Backpack) = 0 THEN 
     begin
     if FindType($0F0B, BoxBan) > 0 THEN
     begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;                     
     until Dead = false
     end;        
     NewMoveXY(HouseX, HouseY, false, 1, true );
     wait(100);
     UseObject(Backpack); //Открываем Рюкзак;
     wait(100);
     UseObject(BoxBig);
     wait(100);
     UseObject(BoxBan);
     wait(100);
     FindType( $0F0B, BoxBan);
     AddToSystemJournal('Берём рефреш!!!');
     wait (350);
     grab(FindItem,1);
     UOSay(Chr(39)+'pc quaf refresh' );
     wait (8100);
     end;
     end;
     end;
   until Stam > 100
    //Выкладываем пустую бутылку
     IF FindType($0F0E, Backpack) > 0 THEN  
     begin
     repeat
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;                     
     until Dead = false
     end;        
     NewMoveXY(HouseX, HouseY, false, 1, true );
     wait(100);
     UseObject(Backpack); //Открываем Рюкзак;
     wait(100);
     UseObject(BoxBig);
     wait(100);
     UseObject(BoxBan);
     wait(100);
     AddToSystemJournal('Выкладываем бутылку-и!!!');
     FindType($0F0E, Backpack);
     wait (350);
     MoveItem(FindItem,0,BoxBan,0,0,0);
     until FindItem = 0
     end;
     if FindType( $0F0C, Backpack) = 0 THEN
     begin
     if FindType($0F0C, BoxBan) > 0 THEN
     begin 
     if Dead = true then
     begin
     Disconnect;
     repeat
     NewMoveXY(HealerX, HealerY, false, 0, true );
     if Murder = true  then
     begin
     useobject(Krest);
     wait(3000);
     end;                     
     until Dead = false
     end;        
     NewMoveXY(HouseX, HouseY, false, 1, true );
     wait(100);
     UseObject(Backpack); //Открываем Рюкзак;
     wait(100);
     UseObject(BoxBig);
     wait(100);
     UseObject(BoxBan);
     wait(100);
     FindType( $0F0C, BoxBan);
     AddToSystemJournal('Берём ГХ!!!');
     wait (350);
     grab(FindItem,1);
     end; 
     end;
  until Life = MaxLife
  NewMoveXY(HealerX1, HealerY1, false, 0, true );   
 end;  
Procedure MyHits();
    begin
    if Life <= MyHP  then 
    begin
    if (Life <= 80) then 
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
    if (Life > 80) then wait (350);
    begin
    AddToSystemJournal('Здоровье чара>>>>>>>>>: ' + IntToStr(Life));
    AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));     
    UOSay(Chr(39)+'pc heal self' );
    end;
    end;
end;


Begin
Armor:= false;//если true будет одевать армор,если false не одевает;    
Murder:= false; //если true будет ресаться от креста(Krest),если false нет;  
HitsStamina;
 while true do
 begin
 for t:=1 to 3 do
 begin
 MyHP:= Maxlife - 10 ; 
 UseObject(Backpack); //Открываем Рюкзак;
 wait(100);
 if FindType($0E21, Backpack) = 0 THEN
 begin 
 HitsStamina;
 end; 
 MyHits;
  if Life >= MyHP  then 
    begin 
 AddToSystemJournal('All Release 20=: ' + IntToStr(t));
    FindVertical := 30;
    FindDistance := 18;
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
   end;  
  end;  
///////////////////////////////////////////////////////////////////////////
     for x2:=1 to 3 do
    begin
    UseSkill('Animal Taming');
    if targetpresent then
    begin
    TargetToObject(Corpse);
    end; 
    
    for x1:=1 to 10 do
    begin
    wait(100);
    if Str > 119 then
    begin 
    if ObjAtLayer(LhandLayer) = 0 then
    begin
    if FindType($1B76, BackPack) > 0 THEN
    begin
    FindType($1B76, BackPack); 
    Equip(LhandLayer, finditem);
    wait (250);
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
    FindType($1B74, BackPack);  
    Equip(LhandLayer, finditem);
    wait (250);
    end;
    end;
    end; 
    //////////////////////////////////////////////////////////////////////
    if (Life < 60) then                                                 //
    begin                                                               //
    AddToSystemJournal('Количество здоровья критическое возвращаемся домой');
    HitsStamina;                                                        //
    end;                                                                //
    if (Stam < 40) then                                                   //
    begin                                                                 //
    AddToSystemJournal('Количество стамины критическое возвращаемся домой');                                                         
    HitsStamina;                                                          //
    end;                                                                  //
   if FindType($0E21, Backpack) = 0 THEN                                 //
    begin                                                                 //                                                                               
    HitsStamina;                                                          //
    end;
    FindVertical := 30; 
    FindDistance := 1;
    Corpse:=FindType(Must ,ground);
    if Corpse > 0 then
    begin
    NewMoveXY(HealerX2, HealerY2, false, 0, true );
    end;            
    end;
    for x3:=1 to 10 do
    begin
    wait(100)
    FindVertical := 30; 
    FindDistance := 1;
    Corpse:=FindType(Must ,ground);
    if Corpse > 0 then
    begin
    NewMoveXY(HealerX1, HealerY1, false, 0, true );
    end;
    end;
    for x4:=1 to 10 do
    begin
    wait(100);
    FindVertical := 30; 
    FindDistance := 30;
    Corpse:=FindType(Must ,ground);
    if Corpse > 0 then
    begin
    NewMoveXY(GetX(Corpse), GetY(Corpse), false, 3, true );
    end; 
    end;                                        
   end;                                         
 end;                                                                   
UOSay('All release')
end;                  
End.