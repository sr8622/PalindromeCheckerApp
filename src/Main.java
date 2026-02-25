git filter-branch --env-filter "

OLD_EMAIL='yadavrishika03@gmail.com'
CORRECT_NAME='Shirley Rubesh'
CORRECT_EMAIL='YOUR_GITHUB_EMAIL'

        if [ \"$GIT_COMMITTER_EMAIL\" = \"$OLD_EMAIL\" ]
then
export GIT_COMMITTER_NAME=\"$CORRECT_NAME\"
export GIT_COMMITTER_EMAIL=\"$CORRECT_EMAIL\"
fi
if [ \"$GIT_AUTHOR_EMAIL\" = \"$OLD_EMAIL\" ]
then
export GIT_AUTHOR_NAME=\"$CORRECT_NAME\"
export GIT_AUTHOR_EMAIL=\"$CORRECT_EMAIL\"
fi
" -- --all
