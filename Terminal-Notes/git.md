# Interacting with a Git Repository
These notes are to help show you the main basic important interactions within git. For the full documentation, see the [Git Refrence](https://git-scm.com/docs). Unless you're the one maintaining a repository, there will only be so many of these commands you need to know.

## At the start of a programming session
```git fetch --all``` **Makes sure git refrences are up to date.** Failure to do this may make commands like git status misleading.


> MAKING A NEW GIT REPOSITORY:
git clone <url> | clones an online repository locally

> Pushing Changes to Github:
git add -A | adds all files from local to repository
git commit -m "<message>" | adds commit message
git push origin <branch> | pushes changes to a git repository

> Pulling Changes from Github:
git pull origin <branch> | pulls latest changes from git repository

> Helpful Info
git diff - shows changes between repository and local
git status - shows changes that will be commited to repository
git branch | shows branches, and which one is selected
git checkout <branch>

