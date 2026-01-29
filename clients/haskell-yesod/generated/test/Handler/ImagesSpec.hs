{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ImagesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postImagesGenerationsR" $
        it "returns 501 Not Implemented" $ do
            post ImagesGenerationsR
            statusIs 501

    describe "postImagesEditsR" $
        it "returns 501 Not Implemented" $ do
            post ImagesEditsR
            statusIs 501

    describe "postImagesVariationsR" $
        it "returns 501 Not Implemented" $ do
            post ImagesVariationsR
            statusIs 501
