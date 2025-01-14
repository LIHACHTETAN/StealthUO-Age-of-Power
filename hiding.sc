Program New;
begin
 while true do 
 begin 
 if Hidden then
 begin
 repeat
 if FindType($097B, BackPack) > 0 THEN
    begin
    AddToSystemJournal('Кушаем фишстейки!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
   UseSkill('Stealth');
   AddToSystemJournal('Stealth');
   wait(3100);
 until  Hidden = false ;
 end;
    if FindType($097B, BackPack) > 0 THEN
    begin
    AddToSystemJournal('Кушаем фишстейки!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
   UseSkill('Hiding'); 
   AddToSystemJournal('Hiding');
   wait(3100);
 end;
end.