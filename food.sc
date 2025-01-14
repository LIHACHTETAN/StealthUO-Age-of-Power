Program Food;
begin
 while true do                                                  //
 begin          
 wait(30000);
  if FindType($097B, BackPack) > 0 THEN
    begin
    AddToSystemJournal('Кушаем фишстейки!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
  end;        
end.