////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////////1.1 Alchemy Refresh Shard Age of Power/////////////
/////////////////////////////Forged by LIHACH///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program HealCraft;
Var i: Integer;
    Gins, BottlesID, Heal : Cardinal;
Const
Mortar=   $0E9B;//T�� Mortar;
Boottles= $0F0E;//��� Boottles;
Box=  $666320BA;//����� ������� ���� ����� ����������;����������� �������;

 Begin
 ///////////////////////////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////////////////////////                                                                         
 ///                   �� �������....                                       ////
 SetARStatus(true);                                                          ///
 //���������� ����� ������������: True - ���������� �������, False - ��������///
 ///////////////////////////////////////////////////////////////////////////////
 //                     �� �������....                                       ///
 SetPauseScriptOnDisconnectStatus(true);                                     ///
 //������ ��������� ������� ��� �����������. ���� True �� ��� �����������,   ///
 //��� ���������� ������� ������ �� �����.;                                 ///
 ///////////////////////////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////////////////////////
  while true do
  Begin
   for i:=1 to 30 do
   begin
   finddistance:= 4;
   AddToSystemJournal('30=' + IntToStr(i) + ' >>> ��� 30 ����� ������... ||');
    
     repeat
      UseObject(Backpack); //��������� ������;
      wait(100);
      Heal:=Findtype($0F0B,BackPack);
       if Heal > 0 then
       begin 
       UseObject(Box);
       FindType($0F0B,BackPack);
       if finditem <> 0 then 
       begin
       FindType($0F0B,Box);
       if finditem = 0 then
       MoveItem(Heal,0,Box,0,0,0)
       else
       MoveItem(Heal,0,Finditem,0,0,0)
       end;  
       end;
       wait(400);
       until Heal = 0;
     Findtype(Mortar,BackPack);
     if Mortar = -1 then
     begin
     AddToSystemJournal('��� Mortar � �������...' );
     end;
     Useobject(finditem);
     WaitForTarget(3000);
     if targetpresent then
     begin
     BottlesID:=Findtype(Boottles,BackPack);
     if BottlesID <> -1 then
      begin
      Gins:=Findtype($0F7A,BackPack);
       if Gins <> -1 then
       begin
       TargetToObject(BottlesID);
       AddToSystemJournal('����� Refresh...' );
       WaitMenu ('Alchemy', 'Refresh Potions');
       WaitMenu ('Refresh Potions', 'Total refresh potion'); 
       //�������� �� �������������;
       CancelMenu;
       wait(7600);
       end;
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
  end;
 end.
    
