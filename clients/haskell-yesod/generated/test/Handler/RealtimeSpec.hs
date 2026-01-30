{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.RealtimeSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postRealtimeSessionsR" $
        it "returns 501 Not Implemented" $ do
            post RealtimeSessionsR
            statusIs 501
