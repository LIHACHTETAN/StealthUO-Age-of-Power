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
Katana= $1EBC; //tinker tool;
Logs= $1BE0; //��� ������;
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
 UOSay(Chr(39)+'craftcreate 1' );  
 wait(3100);
 for i:=1 to 180 do
  begin
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> ��� 30 ����� ������... ||');
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
     sd:=Findtype(Logs,BackPack);
     if sd <> -1 then
     begin
     TargetToObject(sd);
     if (GetSkillValue('Tinkering')) < 28 then
     begin 
     UOSay(Chr(39)+'craftcreate 0' );
     AddToSystemJournal('������ �����...' );
     WaitMenu ('Tinkering', 'Club');
     end;
     if (GetSkillValue('Tinkering')) >= 28 then
     begin
     UOSay(Chr(39)+'craftcreate 1' );
     WaitMenu ('Tinkering', 'Blank Scroll');
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