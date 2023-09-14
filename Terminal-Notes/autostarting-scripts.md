1. create a new script in /home/dalmontron/Documents/Scripts/extra

2. add a new ExecStart=/your/script/here under the [Service] column in /etc/systemd/system/autostart-script.service

3.  [optional]. if you want to start your script immediately instead of the next restart, do: sudo systemctl enable --now autostart-script.service

