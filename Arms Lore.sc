Program Arms_Lore;
begin
 while true do 
 begin 

    if FindType($097B, BackPack) > 0 THEN
    begin
    AddToSystemJournal('������ ���������!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
 if FindType($0E85, BackPack) > 0 THEN UseSkill('Arms Lore');
   wait(100); 
   if targetpresent then
                    begin
                    TargetToObject(finditem);//������� �������
                    end;
                        
   wait(3100);
 end;
end.