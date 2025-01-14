program ZariadkaVandRecal; 
// v.1.00 � MAXHO 

// ������� ����-������ 
// - ������ ����� �� ����� ����� ������ ����� ����� 20 ������� � ���������� � ������ ����� ��� ��������� 
// - BagFrom - ������� ���� ����� ��� ����� ������ ����� 
// - BagTo - ������� ���� ����� ���� ������ ��������� ����� 

CONST 
BagFrom =  $66631D8A;
BagTo =    $66631C5D;
Wand =         $0DF2;

VAR 
NewWand : Cardinal; 

procedure GrabWand; 
begin 
If FindType(Wand, BagFrom) <> 0 then 
begin 
AddToSystemJournal('����� ������ ���� � �������.'); 
MoveItem(finditem, 0, backpack, 0, 0, 0); 
Wait(350);  
end else 
begin 
while FindType(Wand, BagFrom) = 0 do 
begin 
AddToSystemJournal('����������� �����'); 
UseObject(BagFrom); 
Wait(3200); 
end; 
end; 
end; 

procedure Medit; 
begin 
if Mana > 15 then exit; 
while Mana < 78 do 
begin 
UseSkill('Meditation'); 
Wait(3200); 
end; 
end; 

procedure Scan; 
begin 
if InJournal('��������') <> -1 then 
begin 
If FindType(Wand, backpack) <> 0 then 
begin
UseObject(BagFrom); 
Wait(3200); 
AddToSystemJournal('������ ���������� ���� � ������ �����.'); 
MoveItem(finditem, 0, BagTo, 0, 0, 0); 
Wait(320); 
ClearJournal;
CancelTarget;
end; 
end; 
end; 

BEGIN 
AddToSystemJournal('�������� ������...'); 
Wait(1000); 
UOSay(Chr(39)+'resend'); 
Wait(5000); 
UseObject(BagFrom); 
Wait(1000); 
AddToSystemJournal('������ ����� � ������.'); 

while true do 
begin
CancelMenu;  
If FindType(Wand, backpack) <> 0 then 
begin
NewWand:=FindType(Wand, backpack);
Wait(100); 
WaitTargetObject(NewWand); 
UseSkill('Inscription'); 
WaitMenu ('Choose a Circle', 'Fourth Circle'); 
WaitMenu ('Choose the Spell', 'Recall');
Wait(3000); 
end 
else 
begin
GrabWand;
end;  
Scan; 
Medit; 
end; 
END.

