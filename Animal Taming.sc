//////////////////////////>>>�������� ������<<</////////////////////////////////
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
//������� ��� ������ � ��������;
BoxBig= $6BCE6257; // ��������� ID ��������� �������;
BoxBan= $6BFF4ADD; // ��������� ID ������� ��� ��������,�����; 
BoxArm= $5BDA4447; // ��������� ID ������� ��� ������ ;
BoxHit= $68EDDED1; // ��������� ID ������� ��� �����;
HouseX= 6080;
HouseY= 2993;
HealerX=6080;
HealerY=2997;
Krest=$4D3CABFB;
// ������ ����������;
HealerX2=6105;
HealerY2=2923;
// ������ ����������;
HealerX1=6107;
HealerY1=2922;  
Must= $003D; // ��� ��������� �������� ��������� 003D-�����, 00DA-����;   
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
    UseObject(Backpack); //��������� ������;
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
    AddToSystemJournal('����� � ������� ���!!!');
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
    UseObject(Backpack); //��������� ������;
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
    AddToSystemJournal('����� � ������� ���!!!');
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
    AddToSystemJournal('������� �����!!!');
    wait(3000);
    end;  
    ////////////////////////////////////////////////////////////////////////////                
    ////////////////////////////////////////////////////////////////////////////
    /////////////////////Dress//////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    // ������� �������� �����;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� ��������!!!');
            end;
        end;                
    end;
    
   // ������� �������� ���� �����;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� �������� ����!!!');
            end;
        end;                
    end; 
    
   // ������� ����� �����;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� �����!!!');
            end;
        end;                
    end;
   
   // ������� ��������� �����;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� ���������!!!');
            end;
        end;                
    end;      
    
   // ������� �������� �����;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� ��������!!!');
            end;
        end;                
    end;
    
   // ������� ����� �����;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� �����!!!');
            end;
        end;                
    end;  
    
    // ������� �������� ����;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� ��������!!!');
            end;
        end;                
    end;
    ////////////////////////////////////////////////////////////////////////////    
    // ������� �������� ����;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� �������� ����!!!');
            end;
        end;                
    end;
    ////////////////////////////////////////////////////////////////////////    
    // ������� �����;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� �����!!!');
            end;
        end;                
    end;

    ////////////////////////////////////////////////////////////////////////////
    // ������� ������;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� ������!!!');
            end;
        end;                
    end;
  
////////////////////////////////////////////////////////////////////////////
    // ������� ���������;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� ���������!!!');
            end;
        end;                
    end;      
    ////////////////////////////////////////////////////////////////////////////
    // ������� ��������;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� ��������!!!');
            end;
        end;                
    end;
    ////////////////////////////////////////////////////////////////////////////
     // ������� �����;
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
        UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������� �����!!!');
            end;
        end;                
    end;
    
 end;//����� �������� ������;
    ////////////////////////////////////////////////////////////////////////////
    //������ ��������; 
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
    UseObject(Backpack); //��������� ������;
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
    //�������� ���������� �������� � �������;
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
    UseObject(Backpack); //��������� ������;
    wait(100);
    UseObject(BoxBig);
    wait(100);
    UseObject(BoxBan);
    wait(100);
    AddToSystemJournal('����� �����!!!');
    wait (350);
    grab(Band,100-Count($0E21));
    end;
    ////////////////////////////////////////////////////////////////////////////
    //���� HP �� ������ ������� �������,���� �� ������ 60 ���� �����;  
    if (Life < MaxLife) then
    begin
    if (Life <= 60) then
    begin
    if FindType( $0F0C, Backpack) = 0 THEN
    begin
    NewMoveXY(HouseX, HouseY, false, 1, true );
    wait(100);
    UseObject(Backpack); //��������� ������;
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
    UseObject(Backpack); //��������� ������;
    wait(100);
    UseObject(BoxBig);
    wait(100);
    UseObject(BoxBan);
    wait(100);        
    FindType( $0F0C, BoxBan);
    AddToSystemJournal('���� ��!!!');
    wait (350);
    grab(FindItem,1);
    end; 
    UOSay(Chr(39)+'pc heal self' );
    AddToSystemJournal('�������������� ��������!!!');
    wait(8000);
    end;
    end;
    if (Life <= 60) then 
    begin
    if FindType( $0F0C,backpack) > 0 then
    begin
    UOSay(Chr(39)+'pc quaf heal' );
    AddToSystemJournal('�������������� ��������,���� �����!!!');
    wait(8000);
    end;
    end;
    if (Life > 60) then 
    begin
    UOSay(Chr(39)+'pc heal self' );
    AddToSystemJournal('�������������� ��������!!!');
    wait(8000);
    end; 
    end;
   

     //����� ������ ���� Stam ������ 100, � ����������;
     if Stam < 100 THEN 
     begin
     NewMoveXY(HouseX, HouseY, false, 1, true );
     wait(100);
     UseObject(Backpack); //��������� ������;
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
     UseObject(Backpack); //��������� ������;
     wait(100);
     UseObject(BoxBig);
     wait(100);
     UseObject(BoxBan);
     wait(100);
     FindType( $0F0B, BoxBan);
     AddToSystemJournal('���� ������!!!');
     wait (350);
     grab(FindItem,1);
     UOSay(Chr(39)+'pc quaf refresh' );
     wait (8100);
     end;
     end;
     end;
   until Stam > 100
    //����������� ������ �������
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
     UseObject(Backpack); //��������� ������;
     wait(100);
     UseObject(BoxBig);
     wait(100);
     UseObject(BoxBan);
     wait(100);
     AddToSystemJournal('����������� �������-�!!!');
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
     UseObject(Backpack); //��������� ������;
     wait(100);
     UseObject(BoxBig);
     wait(100);
     UseObject(BoxBan);
     wait(100);
     FindType( $0F0C, BoxBan);
     AddToSystemJournal('���� ��!!!');
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
    AddToSystemJournal('�������� ����>>>>>>>>>: ' + IntToStr(Life));
    AddToSystemJournal('�������� �������� ����: ' + IntToStr(MaxLife));
    UOSay(Chr(39)+'pc quaf heal' );
    end;
    AddToSystemJournal('�������� ����>>>>>>>>>: ' + IntToStr(Life));
    AddToSystemJournal('�������� �������� ����: ' + IntToStr(MaxLife));     
    UOSay(Chr(39)+'pc heal self' );
    end;
    if (Life > 80) then wait (350);
    begin
    AddToSystemJournal('�������� ����>>>>>>>>>: ' + IntToStr(Life));
    AddToSystemJournal('�������� �������� ����: ' + IntToStr(MaxLife));     
    UOSay(Chr(39)+'pc heal self' );
    end;
    end;
end;


Begin
Armor:= false;//���� true ����� ������� �����,���� false �� �������;    
Murder:= false; //���� true ����� �������� �� ������(Krest),���� false ���;  
HitsStamina;
 while true do
 begin
 for t:=1 to 3 do
 begin
 MyHP:= Maxlife - 10 ; 
 UseObject(Backpack); //��������� ������;
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
            AddToSystemJournal('������ ��������');
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
    AddToSystemJournal('���������� �������� ����������� ������������ �����');
    HitsStamina;                                                        //
    end;                                                                //
    if (Stam < 40) then                                                   //
    begin                                                                 //
    AddToSystemJournal('���������� ������� ����������� ������������ �����');                                                         
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