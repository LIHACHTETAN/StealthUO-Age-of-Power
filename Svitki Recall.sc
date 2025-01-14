program ZariadkaVandRecal; 
CONST  
Wand = $0E34; 
VAR NewWand : Cardinal; 






BEGIN 

while true do 
begin
if (GetMana(self) < 15) then 
begin
while Mana <> MaxMana do
begin 
UseSkill('Meditation'); 
Wait(3300); 
end; 
end;
CancelMenu;  
If FindType(Wand, backpack) <> 0 then 
begin
NewWand:=FindType(Wand, backpack);
Wait(100); 
WaitTargetObject(NewWand); 
UseSkill('Inscription'); 
WaitMenu ('Choose a Circle', 'Fourth Circle'); 
WaitMenu ('Choose the Spell', 'Recall');
Wait(3700);   
end;
end;
END.

