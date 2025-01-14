program Kindlings;

begin
  while True do
  begin 
  if (not Hidden) then
begin
  UseSkill('Hiding');
  wait(3100)
end;
    useobject($71DF23F1);
    wait(100);
    if targetpresent then
    begin
      TargetToTile(3290, 1000, 2562, GetZ(self));
      wait(3000);
    end;
  end;
end.
