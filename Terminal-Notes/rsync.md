NAVIGATING DIRECTORYS IN THE TERMINAL
pwd - shows current directory
cd .. - goes up one directory
ls - shows directorys inside current directorys that can be cd'd into
cd [insert directory here] goes down one directory into the specified directory.

RSYNC COMMANDS
rsync -x --x original/dir target/dir
original/dir target/dir -  syncs the original file into target file
original/dir/ target/dir/ - syncs everything in original to target file
original/dir/* target/dir/* - syncs file contents
-r - syncs file contents and subdirectorys
-a - syncs file contents and subdirectorys and read/write permissions (everything)
-z - compresses data while transfering
-v - shows output of what will be synced between directorys
-P - shows progress
--dry-run - keeps anything from syncing (used for testing where files will be synced)
--delete - deletes excess files in target that aren't in original (!!be careful)

