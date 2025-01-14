Program New;
begin
 while true do                                                  //
 begin          
 useskill('Detecting Hidden');
 wait(100);
 if targetpresent then
    begin
    WaitTargetObject(self)
    end;
 wait(3000);
  if FindType($097B, BackPack) > 0 THEN
    begin
    AddToSystemJournal('Кушаем фишстейки!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
  end;        
end.