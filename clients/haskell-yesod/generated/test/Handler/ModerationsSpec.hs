{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ModerationsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postModerationsR" $
        it "returns 501 Not Implemented" $ do
            post ModerationsR
            statusIs 501
