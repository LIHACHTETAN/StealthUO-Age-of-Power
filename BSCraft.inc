////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////////1.1 BScraft include Shard Age of Power/////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
//� ������ ����� ���� , ���������.����� ������ ���������� ����.................
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
Procedure BScraft;
Var i: Integer; 
Begin
 for i:=1 to 10 do
  begin
  AddToSystemJournal('30=' + IntToStr(i) + ' >>> ��� 30 ����� ������... ||');
  Useobject(BoxBig);
  UseObject(Backpack); //��������� ������;
  FindDistance := 10;
  Findtype(Ruda,BoxBig);
   if FindFullQuantity > 0 then
    begin
    AddToSystemJournal('|||||||||||||||||||||||||||||||||||' );
    AddToSystemJournal('���� ����...                    ||' );
    grab(finditem,Kolichestvo);
    wait(100);
    end; 
    UseObject(Backpack); //��������� ������;
    Useobject(BoxBig);
    repeat
    Findtype(Ruda,BackPack);
    if FindFullQuantity > 0 then
    begin
     Useobject(finditem);
     WaitForTarget(3000);
     if targetpresent then
     begin
     AddToSystemJournal('������...                      ||' );
     TargetToObject(Stanok); 
     //�������� �� �������������;
     wait(3000);
     end;
   end;
   Findtype(Ruda,BackPack);
   until FindItem = 0  
  end; 
   if FindType($097B, BoxBig) > 0 THEN
    begin
    AddToSystemJournal('������...                       ||' );
    UseObject(finditem);
    wait(3000);
    end;
 Disconnect;
 UOSay(Chr(39)+'Resend' );
 AddToSystemJournal('������...                        || ');
 wait(8000);        
End;