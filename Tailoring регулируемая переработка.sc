////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////////3.1 Tailoring Shard Age of Power///////////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
//� ������ ����� ����� ��� ������� , ���������.����� ������ ���������� ������.
//��������� ������ � ������ ������� ����� ������� , �� � � ������� ����� ������
//������ � ������ ����� � ������. ��� ��� �� � �� ������� �������� !!!/////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Program Tailoring;
Var sd,i: Integer;
Const
BoxBig= $651544C1; //������ � �������;
Cotton= $0DF9; //T�� ������;
Spool= $0FA0; //��� �������;
Stanok= $652171DF; //������;
/////////////////////////////////////////////////////////////////
//�������� ������ 6/1 ���� �� �������� �������;                //
//typeid= 6;                                                   //
//typeiditem= 1;                                               //
/////////////////////////////////////////////////////////      //
/////////////////////////////////////////////////////////      //
//�������� ������ 60/60 ���� ������ ������� �����;     //      //
//typeid= 60;                                          //      //
//typeiditem= 60;                                      //      //
/////////////////////////////////////////////////////////      //
typeid= 60;                                                    //
typeiditem= 60;                                                //
/////////////////////////////////////////////////////////////////
Begin
 while true do
 Begin
 for i:=1 to 30 do
  begin
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> ��� 30 ����� ������... ||');
  Useobject(BoxBig);
  UseObject(Backpack); //��������� ������;
  FindDistance := 10;
  Findtype($0DF9,BoxBig);
   if FindFullQuantity > 0 then
    begin
    AddToSystemJournal('|||||||||||||||||||||||||||||||||||' );
    AddToSystemJournal('���� ������...                  ||' );
    grab(finditem,typeiditem);
    wait(100);
    end;
    Useobject(BoxBig);
    UseObject(Backpack); //��������� ������;
    Findtype($0DF9,BackPack);
    if FindFullQuantity > 0 then
    begin
     Useobject(finditem);
     WaitForTarget(3000);
     if targetpresent then
     begin
     AddToSystemJournal('������� �������...               ||' );
     TargetToObject(Stanok); 
     //�������� �� �������������;
     wait(3000);
     end;
     if  Findtype($0DF9,BackPack)>= typeid then
     begin
     AddToSystemJournal('������������� ������� � ������...||' );
     AddToSystemJournal('|||||||||||||||||||||||||||||||||||' );
     MoveItem(FindItem,0,BoxBig,0,0,0);
     wait(300);
     end;
   end;  
  FindDistance := 10;
  Findtype($0FA0,BoxBig);
   if FindFullQuantity >= typeid then
   begin
   AddToSystemJournal('���� �������...                  ||');
   grab(finditem,typeid);
   wait(100);
   end;
    Useobject(BoxBig);
    UseObject(Backpack); //��������� ������;
     Findtype($0FA0,BackPack);
     if FindFullQuantity >= typeid then
     begin
     Useobject(finditem);
     WaitForTarget(3000);
      if targetpresent then
      begin
      TargetToObject(Stanok);
      AddToSystemJournal('������� �����...                 ||' );
      //�������� �� �������������;
      wait(3000);
      end;
     end;
    if  Findtype($0F95,BackPack)> 0 then
    begin
    AddToSystemJournal('������������� ����� � ������...  ||' );
    AddToSystemJournal('|||||||||||||||||||||||||||||||||||' );
    MoveItem(FindItem,0,BoxBig,0,0,0);
    wait(300);
    end;
  end; 
   if FindType($097B, BoxBig) > 0 THEN
    begin
    AddToSystemJournal('������...                        ||' );
    UseObject(finditem);
    wait(3000);
    end;
 UOSay(Chr(39)+'Resend' );
 AddToSystemJournal('������...                        || ');
 wait(8000);    
 End;    
End.