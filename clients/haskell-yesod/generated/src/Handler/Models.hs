{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Models where

import           Import


-- | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
--
-- operationId: deleteModel
deleteModelsByTextR :: Text -- ^ The model to delete
                    -> Handler Value
deleteModelsByTextR model = notImplemented

-- | Lists the currently available models, and provides basic information about each one such as the owner and availability.
--
-- operationId: listModels
getModelsR :: Handler Value
getModelsR = notImplemented

-- | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
--
-- operationId: retrieveModel
getModelsByTextR :: Text -- ^ The ID of the model to use for this request
                 -> Handler Value
getModelsByTextR model = notImplemented
