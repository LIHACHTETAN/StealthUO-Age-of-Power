////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
///////////////////////////1.2 BlackSmithy Shard Age of Power///////////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program BlackSmithy;
Var sd,i: Integer;
Const
Katana= $0FBC ; //T�� �������;
TinkerTool=$1EBC;
Logs= $1BF2; //��� �������;
BoxBig= $6599A3BD; //������ � ������ ID;
Ruda= $19B9; //T�� ����;
Stanok=  $65CDA95A; //��������� ID;
Kolichestvo= 30; // ���������� ���� ��� ����������;
{$Include 'BSCraft.inc'}
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
 for i:=1 to 100 do
  begin 
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> ��� 30 ����� ������... ||');
    UseObject(Backpack); //��������� ������;
    wait(100);
     FindTypeEx(Katana,-1,BackPack,true);
     if finditem = 0 then
     begin
     AddToSystemJournal('��� ������� � �������...' );

     FindTypeEx(TinkerTool,-1,BackPack,true);
     Useobject(finditem);
     WaitForTarget(3200);
     if targetpresent then
     begin
     UOSay(Chr(39)+'craftcreate 1' );
     sd:=Findtype(Logs,BackPack);
     if sd <> 0 then
     begin
     //AddToSystemJournal('������ ��������...' );
     TargetToObject(sd);
     WaitMenu ('Tinkering','Other Tools');
     wait(50);
     WaitMenu ('Other Tools','(9)');
     wait(3000);
       if MenuHookPresent() = True then CancelMenu();
     end;
     end;
     end;
     FindTypeEx(Katana,-1,BackPack,true);
     Useobject(finditem);
     WaitForTarget(3200);
     if targetpresent then
     begin 
     UOSay(Chr(39)+'craftcreate 0' );
     sd:=Findtype(Logs,BackPack);
     if sd <> 0 then
     begin
     //AddToSystemJournal('������ ��������...' );
     TargetToObject(sd);
     WaitMenu ('Blacksmithing','Armor');
     wait(50);
     WaitMenu ('Armor','Plate Mail');
     wait(50);
     WaitMenu ( 'Plate Mail','(0)');
     wait(3000);
       if MenuHookPresent() = True then CancelMenu();
     end;
     sd:=Findtype(Logs,BackPack);
     if (sd = 0) or (Count(Logs) < 100) then
     begin
     AddToSystemJournal('���������� ������...' ); 
     BSCraft;
     end;
     end; 
  end;
  wait(5000);
   if FindType($097B, backpack) > 0 THEN
    begin
    AddToSystemJournal('������...' );
    UseObject(finditem);
    wait(3000);
    end;
    Disconnect;
    wait(3000);
 UOSay(Chr(39)+'Resend' );
 AddToSystemJournal('������...');
 wait(8000);    
 End;    
End.