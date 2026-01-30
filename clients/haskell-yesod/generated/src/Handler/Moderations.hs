{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Moderations where

import           Import


-- | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
--
-- operationId: createModeration
postModerationsR :: Handler Value
postModerationsR = notImplemented
