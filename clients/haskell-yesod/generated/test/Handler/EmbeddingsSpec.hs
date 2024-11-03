{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.EmbeddingsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postEmbeddingsR" $
        it "returns 501 Not Implemented" $ do
            post EmbeddingsR
            statusIs 501
