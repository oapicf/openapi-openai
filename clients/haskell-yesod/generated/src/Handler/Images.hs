{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Images where

import           Import


-- | Creates an image given a prompt.
--
-- operationId: createImage
postImagesGenerationsR :: Handler Value
postImagesGenerationsR = notImplemented

-- | Creates an edited or extended image given an original image and a prompt.
--
-- operationId: createImageEdit
postImagesEditsR :: Handler Value
postImagesEditsR = notImplemented

-- | Creates a variation of a given image.
--
-- operationId: createImageVariation
postImagesVariationsR :: Handler Value
postImagesVariationsR = notImplemented
