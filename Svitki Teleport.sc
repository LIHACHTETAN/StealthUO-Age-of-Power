program ZariadkaVandRecal; 
// v.1.00 � MAXHO 

// ������� ����-������ 
// - ������ ����� �� ����� ����� ������ ����� ����� 20 ������� � ���������� � ������ ����� ��� ��������� 
// - BagFrom - ������� ���� ����� ��� ����� ������ ����� 
// - BagTo - ������� ���� ����� ���� ������ ��������� ����� 

CONST 
 
Wand = $0E34; 

VAR NewWand : Cardinal; 


procedure Medit; 
begin 
if Mana > 15 then exit; 
while Mana < 78 do 
begin 
UseSkill('Meditation'); 
Wait(3100); 
end; 
end; 



BEGIN 


while true do 
begin
CancelMenu;  
If FindType(Wand, backpack) <> 0 then 
begin
NewWand:=FindType(Wand, backpack);
Wait(100); 
WaitTargetObject(NewWand); 
UseSkill('Inscription'); 
WaitMenu ('Choose a Circle', 'Third Circle'); 
WaitMenu ('Choose the Spell', 'Teleport');
Wait(3400);   
Medit; 
end;
end;
END.

