////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////?1.0 Tinker tool Shard Age of Power////////////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program Tinker_tool;
Var sd,i: Integer;
Const
Katana= $1032; //a smoothing plane;
Logs= $1BD7; //��� boards;
Begin
 ///////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////                                                                         
//                     �� �������....                                       ////
SetARStatus(true);                                                          ////
//���������� ����� ������������: True - ���������� �������, False - ��������////
////////////////////////////////////////////////////////////////////////////////
//                     �� �������....                                       ////
SetPauseScriptOnDisconnectStatus(true);                                     ////
//������ ��������� ������� ��� �����������. ���� True �� ��� �����������,   ////
//��� ���������� ������� ������� �� �����.;                                 ////
////////////////////////////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////////////////////////
 while true do
 Begin
 wait(3100);
 for i:=1 to 180 do
  begin
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> ��� 30 ����� ������... ||');
    UseObject(Backpack); //��������� ������; 
    if Count($1BD7) < 40 then
    begin 
    repeat
    UseObject(Backpack); //��������� ������;   
    Findtype(Katana,BackPack);
    if Katana = -1 then
     begin
     AddToSystemJournal('��� ��������� � �������...' );
     end;
    Useobject(finditem);
     WaitForTarget(3100);
     if targetpresent then
     begin
     sd:=Findtype($1BE0,BackPack);
     if sd <> -1 then
     begin
     TargetToObject(sd);
     UOSay(Chr(39)+'craftcreate 1' );
     AddToSystemJournal('������ Boards...' );
     WaitMenu ('Making boards', 'Boards');
     wait(50);
     WaitMenu ('Boards','3');
     end;
     end;
     wait(3100);
     until (Count($1BD7) > 200) ;
    end; 
     Findtype(Katana,BackPack);
     if Katana = -1 then
     begin
     AddToSystemJournal('��� ��������� � �������...' );
     end;
     Useobject(finditem);
     WaitForTarget(3100);
     if targetpresent then
     begin
     sd:=Findtype(Logs,BackPack);
     if sd <> -1 then
     begin
     TargetToObject(sd);
     if (GetSkillValue('Carpentry')) < 31 then
     begin 
     UOSay(Chr(39)+'craftcreate 0' );
     AddToSystemJournal('������ Box...' );
     WaitMenu ('Carpentry', 'Boxes & Furniture');
     wait(50);
     WaitMenu ('Boxes & Furniture','Boxes & Chests'); 
     wait(50);
     WaitMenu ('Boxes','(1)');
     end;
     if ((GetSkillValue('Carpentry')) >= 31) and ((GetSkillValue('Carpentry')) < 47) then
     begin 
     UOSay(Chr(39)+'craftcreate 0' );
     AddToSystemJournal('������ Box...' );
     WaitMenu ('Carpentry', 'Boxes & Furniture');
     wait(50);
     WaitMenu ('Boxes & Furniture','Boxes & Chests'); 
     wait(50);
     WaitMenu ('Boxes','(2)');
     end; 
     if ((GetSkillValue('Carpentry')) >= 47) and ((GetSkillValue('Carpentry')) < 65) then
     begin 
     UOSay(Chr(39)+'craftcreate 0' );
     AddToSystemJournal('������ Box...' );
     WaitMenu ('Carpentry', 'Boxes & Furniture');
     wait(50);
     WaitMenu ('Boxes & Furniture','Boxes & Chests'); 
     wait(50);
     WaitMenu ('Boxes','(4)');
     end;
     if ((GetSkillValue('Carpentry')) >= 65) then
     begin 
     UOSay(Chr(39)+'craftcreate 0' );
     AddToSystemJournal('������ Box...' );
     WaitMenu ('Carpentry', 'Boxes & Furniture');
     wait(50);
     WaitMenu ('Boxes & Furniture','Boxes & Chests'); 
     wait(50);
     WaitMenu ('Boxes','(5)');
     end;
     //�������� �� �������������;
     wait(3100);
     end;
     sd:=Findtype(Logs,BackPack);
     if sd = -1 then
     begin
     AddToSystemJournal('���������� ������...' );
     end;
     end; 
  end; 
   if FindType($097B, backpack) > 0 THEN
    begin
    AddToSystemJournal('������...' );
    UseObject(finditem);
    wait(3000);
    end;
 UOSay(Chr(39)+'Resend' );
 AddToSystemJournal('������...');
 wait(8200);    
 End;    
End.