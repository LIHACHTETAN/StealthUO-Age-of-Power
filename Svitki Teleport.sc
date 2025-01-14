program ZariadkaVandRecal; 
// v.1.00 © MAXHO 

// Зарядка ванд-рекола 
// - макрос берет из одной сумки пустые ванды пишет 20 реколов и складывает в другую сумку уже записаные 
// - BagFrom - впишите айди суикм где лежат пустые ванды 
// - BagTo - впишите айди сумки куда класть записаные ванды 

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

