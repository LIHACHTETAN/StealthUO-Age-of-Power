////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
////////////////////////////2.0 Bowcraft Shard Age of Power/////////////////////
/////////////////////////////Forged by LIHACH///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program BScraft;
Var sd,i: Integer;
Const
Katana= $13B6; //T�� ������;
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
 UOSay(Chr(39)+'craftcreate 0' );
 for i:=1 to 30 do
  begin
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> ��� 30 ����� ������... ||');
    UseObject(Backpack); //��������� ������;
     Findtype(Katana,BackPack);
     if Katana = -1 then
     begin
     AddToSystemJournal('��� ������ � �������...' );
     end;
     Useobject(finditem);
     WaitForTarget(3100);
     if targetpresent then
     begin
     sd:=Findtype(Logs,BackPack);
     if sd <> -1 then
     begin 
     if (GetSkillValue('Bowcraft/Fletghing') >= 55)  then
     begin 
     AddToSystemJournal('������ Newbybow...' );
     TargetToObject(sd);
     WaitMenu ('Bowcraft', 'Bows'); 
     wait(100);
     WaitMenu ('Bows', 'Hunterbow'); ////������� ���������� ������� 
     //�������� �� �������������; 
     end;
     if (GetSkillValue('Bowcraft/Fletghing') < 55) then
     begin 
     AddToSystemJournal('������ Newbybow...' );
     TargetToObject(sd);
     WaitMenu ('Bowcraft', 'Bows'); 
     wait(100);
     WaitMenu ('Bows', 'Newbybow'); ////������� ���������� ������� 
     //�������� �� �������������; 
     end;
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
 wait(8000);    
 End;    
End.