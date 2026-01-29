{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Moderations where

import           Import


-- | Classifies if text is potentially harmful.
--
-- operationId: createModeration
postModerationsR :: Handler Value
postModerationsR = notImplemented
