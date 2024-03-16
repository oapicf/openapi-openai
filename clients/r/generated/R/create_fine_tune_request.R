#' Create a new CreateFineTuneRequest
#'
#' @description
#' CreateFineTuneRequest Class
#'
#' @docType class
#' @title CreateFineTuneRequest
#' @description CreateFineTuneRequest Class
#' @format An \code{R6Class} generator object
#' @field training_file The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. character
#' @field validation_file The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. character [optional]
#' @field model  \link{CreateFineTuneRequestModel} [optional]
#' @field n_epochs The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. integer [optional]
#' @field batch_size The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2\% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. integer [optional]
#' @field learning_rate_multiplier The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. numeric [optional]
#' @field prompt_loss_weight The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. numeric [optional]
#' @field compute_classification_metrics If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. character [optional]
#' @field classification_n_classes The number of classes in a classification task.  This parameter is required for multiclass classification. integer [optional]
#' @field classification_positive_class The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. character [optional]
#' @field classification_betas If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. list(numeric) [optional]
#' @field suffix A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateFineTuneRequest <- R6::R6Class(
  "CreateFineTuneRequest",
  public = list(
    `training_file` = NULL,
    `validation_file` = NULL,
    `model` = NULL,
    `n_epochs` = NULL,
    `batch_size` = NULL,
    `learning_rate_multiplier` = NULL,
    `prompt_loss_weight` = NULL,
    `compute_classification_metrics` = NULL,
    `classification_n_classes` = NULL,
    `classification_positive_class` = NULL,
    `classification_betas` = NULL,
    `suffix` = NULL,
    #' Initialize a new CreateFineTuneRequest class.
    #'
    #' @description
    #' Initialize a new CreateFineTuneRequest class.
    #'
    #' @param training_file The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.
    #' @param validation_file The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.
    #' @param model model
    #' @param n_epochs The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.. Default to 4.
    #' @param batch_size The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2\% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets.
    #' @param learning_rate_multiplier The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results.
    #' @param prompt_loss_weight The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt.. Default to 0.01.
    #' @param compute_classification_metrics If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification.. Default to FALSE.
    #' @param classification_n_classes The number of classes in a classification task.  This parameter is required for multiclass classification.
    #' @param classification_positive_class The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.
    #' @param classification_betas If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall.
    #' @param suffix A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`training_file`, `validation_file` = NULL, `model` = NULL, `n_epochs` = 4, `batch_size` = NULL, `learning_rate_multiplier` = NULL, `prompt_loss_weight` = 0.01, `compute_classification_metrics` = FALSE, `classification_n_classes` = NULL, `classification_positive_class` = NULL, `classification_betas` = NULL, `suffix` = NULL, ...) {
      if (!missing(`training_file`)) {
        if (!(is.character(`training_file`) && length(`training_file`) == 1)) {
          stop(paste("Error! Invalid data for `training_file`. Must be a string:", `training_file`))
        }
        self$`training_file` <- `training_file`
      }
      if (!is.null(`validation_file`)) {
        if (!(is.character(`validation_file`) && length(`validation_file`) == 1)) {
          stop(paste("Error! Invalid data for `validation_file`. Must be a string:", `validation_file`))
        }
        self$`validation_file` <- `validation_file`
      }
      if (!is.null(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
      }
      if (!is.null(`n_epochs`)) {
        if (!(is.numeric(`n_epochs`) && length(`n_epochs`) == 1)) {
          stop(paste("Error! Invalid data for `n_epochs`. Must be an integer:", `n_epochs`))
        }
        self$`n_epochs` <- `n_epochs`
      }
      if (!is.null(`batch_size`)) {
        if (!(is.numeric(`batch_size`) && length(`batch_size`) == 1)) {
          stop(paste("Error! Invalid data for `batch_size`. Must be an integer:", `batch_size`))
        }
        self$`batch_size` <- `batch_size`
      }
      if (!is.null(`learning_rate_multiplier`)) {
        self$`learning_rate_multiplier` <- `learning_rate_multiplier`
      }
      if (!is.null(`prompt_loss_weight`)) {
        self$`prompt_loss_weight` <- `prompt_loss_weight`
      }
      if (!is.null(`compute_classification_metrics`)) {
        if (!(is.logical(`compute_classification_metrics`) && length(`compute_classification_metrics`) == 1)) {
          stop(paste("Error! Invalid data for `compute_classification_metrics`. Must be a boolean:", `compute_classification_metrics`))
        }
        self$`compute_classification_metrics` <- `compute_classification_metrics`
      }
      if (!is.null(`classification_n_classes`)) {
        if (!(is.numeric(`classification_n_classes`) && length(`classification_n_classes`) == 1)) {
          stop(paste("Error! Invalid data for `classification_n_classes`. Must be an integer:", `classification_n_classes`))
        }
        self$`classification_n_classes` <- `classification_n_classes`
      }
      if (!is.null(`classification_positive_class`)) {
        if (!(is.character(`classification_positive_class`) && length(`classification_positive_class`) == 1)) {
          stop(paste("Error! Invalid data for `classification_positive_class`. Must be a string:", `classification_positive_class`))
        }
        self$`classification_positive_class` <- `classification_positive_class`
      }
      if (!is.null(`classification_betas`)) {
        stopifnot(is.vector(`classification_betas`), length(`classification_betas`) != 0)
        sapply(`classification_betas`, function(x) stopifnot(is.character(x)))
        self$`classification_betas` <- `classification_betas`
      }
      if (!is.null(`suffix`)) {
        if (!(is.character(`suffix`) && length(`suffix`) == 1)) {
          stop(paste("Error! Invalid data for `suffix`. Must be a string:", `suffix`))
        }
        self$`suffix` <- `suffix`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateFineTuneRequest in JSON format
    #' @export
    toJSON = function() {
      CreateFineTuneRequestObject <- list()
      if (!is.null(self$`training_file`)) {
        CreateFineTuneRequestObject[["training_file"]] <-
          self$`training_file`
      }
      if (!is.null(self$`validation_file`)) {
        CreateFineTuneRequestObject[["validation_file"]] <-
          self$`validation_file`
      }
      if (!is.null(self$`model`)) {
        CreateFineTuneRequestObject[["model"]] <-
          self$`model`$toJSON()
      }
      if (!is.null(self$`n_epochs`)) {
        CreateFineTuneRequestObject[["n_epochs"]] <-
          self$`n_epochs`
      }
      if (!is.null(self$`batch_size`)) {
        CreateFineTuneRequestObject[["batch_size"]] <-
          self$`batch_size`
      }
      if (!is.null(self$`learning_rate_multiplier`)) {
        CreateFineTuneRequestObject[["learning_rate_multiplier"]] <-
          self$`learning_rate_multiplier`
      }
      if (!is.null(self$`prompt_loss_weight`)) {
        CreateFineTuneRequestObject[["prompt_loss_weight"]] <-
          self$`prompt_loss_weight`
      }
      if (!is.null(self$`compute_classification_metrics`)) {
        CreateFineTuneRequestObject[["compute_classification_metrics"]] <-
          self$`compute_classification_metrics`
      }
      if (!is.null(self$`classification_n_classes`)) {
        CreateFineTuneRequestObject[["classification_n_classes"]] <-
          self$`classification_n_classes`
      }
      if (!is.null(self$`classification_positive_class`)) {
        CreateFineTuneRequestObject[["classification_positive_class"]] <-
          self$`classification_positive_class`
      }
      if (!is.null(self$`classification_betas`)) {
        CreateFineTuneRequestObject[["classification_betas"]] <-
          self$`classification_betas`
      }
      if (!is.null(self$`suffix`)) {
        CreateFineTuneRequestObject[["suffix"]] <-
          self$`suffix`
      }
      CreateFineTuneRequestObject
    },
    #' Deserialize JSON string into an instance of CreateFineTuneRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateFineTuneRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateFineTuneRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`training_file`)) {
        self$`training_file` <- this_object$`training_file`
      }
      if (!is.null(this_object$`validation_file`)) {
        self$`validation_file` <- this_object$`validation_file`
      }
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateFineTuneRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
      }
      if (!is.null(this_object$`n_epochs`)) {
        self$`n_epochs` <- this_object$`n_epochs`
      }
      if (!is.null(this_object$`batch_size`)) {
        self$`batch_size` <- this_object$`batch_size`
      }
      if (!is.null(this_object$`learning_rate_multiplier`)) {
        self$`learning_rate_multiplier` <- this_object$`learning_rate_multiplier`
      }
      if (!is.null(this_object$`prompt_loss_weight`)) {
        self$`prompt_loss_weight` <- this_object$`prompt_loss_weight`
      }
      if (!is.null(this_object$`compute_classification_metrics`)) {
        self$`compute_classification_metrics` <- this_object$`compute_classification_metrics`
      }
      if (!is.null(this_object$`classification_n_classes`)) {
        self$`classification_n_classes` <- this_object$`classification_n_classes`
      }
      if (!is.null(this_object$`classification_positive_class`)) {
        self$`classification_positive_class` <- this_object$`classification_positive_class`
      }
      if (!is.null(this_object$`classification_betas`)) {
        self$`classification_betas` <- ApiClient$new()$deserializeObj(this_object$`classification_betas`, "array[numeric]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`suffix`)) {
        self$`suffix` <- this_object$`suffix`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateFineTuneRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`training_file`)) {
          sprintf(
          '"training_file":
            "%s"
                    ',
          self$`training_file`
          )
        },
        if (!is.null(self$`validation_file`)) {
          sprintf(
          '"validation_file":
            "%s"
                    ',
          self$`validation_file`
          )
        },
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
          %s
          ',
          jsonlite::toJSON(self$`model`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`n_epochs`)) {
          sprintf(
          '"n_epochs":
            %d
                    ',
          self$`n_epochs`
          )
        },
        if (!is.null(self$`batch_size`)) {
          sprintf(
          '"batch_size":
            %d
                    ',
          self$`batch_size`
          )
        },
        if (!is.null(self$`learning_rate_multiplier`)) {
          sprintf(
          '"learning_rate_multiplier":
            %d
                    ',
          self$`learning_rate_multiplier`
          )
        },
        if (!is.null(self$`prompt_loss_weight`)) {
          sprintf(
          '"prompt_loss_weight":
            %d
                    ',
          self$`prompt_loss_weight`
          )
        },
        if (!is.null(self$`compute_classification_metrics`)) {
          sprintf(
          '"compute_classification_metrics":
            %s
                    ',
          tolower(self$`compute_classification_metrics`)
          )
        },
        if (!is.null(self$`classification_n_classes`)) {
          sprintf(
          '"classification_n_classes":
            %d
                    ',
          self$`classification_n_classes`
          )
        },
        if (!is.null(self$`classification_positive_class`)) {
          sprintf(
          '"classification_positive_class":
            "%s"
                    ',
          self$`classification_positive_class`
          )
        },
        if (!is.null(self$`classification_betas`)) {
          sprintf(
          '"classification_betas":
             [%s]
          ',
          paste(unlist(lapply(self$`classification_betas`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`suffix`)) {
          sprintf(
          '"suffix":
            "%s"
                    ',
          self$`suffix`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateFineTuneRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateFineTuneRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateFineTuneRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`training_file` <- this_object$`training_file`
      self$`validation_file` <- this_object$`validation_file`
      self$`model` <- CreateFineTuneRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      self$`n_epochs` <- this_object$`n_epochs`
      self$`batch_size` <- this_object$`batch_size`
      self$`learning_rate_multiplier` <- this_object$`learning_rate_multiplier`
      self$`prompt_loss_weight` <- this_object$`prompt_loss_weight`
      self$`compute_classification_metrics` <- this_object$`compute_classification_metrics`
      self$`classification_n_classes` <- this_object$`classification_n_classes`
      self$`classification_positive_class` <- this_object$`classification_positive_class`
      self$`classification_betas` <- ApiClient$new()$deserializeObj(this_object$`classification_betas`, "array[numeric]", loadNamespace("openapi"))
      self$`suffix` <- this_object$`suffix`
      self
    },
    #' Validate JSON input with respect to CreateFineTuneRequest
    #'
    #' @description
    #' Validate JSON input with respect to CreateFineTuneRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `training_file`
      if (!is.null(input_json$`training_file`)) {
        if (!(is.character(input_json$`training_file`) && length(input_json$`training_file`) == 1)) {
          stop(paste("Error! Invalid data for `training_file`. Must be a string:", input_json$`training_file`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateFineTuneRequest: the required field `training_file` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateFineTuneRequest
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `training_file` is null
      if (is.null(self$`training_file`)) {
        return(FALSE)
      }

      if (nchar(self$`suffix`) > 40) {
        return(FALSE)
      }
      if (nchar(self$`suffix`) < 1) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `training_file` is null
      if (is.null(self$`training_file`)) {
        invalid_fields["training_file"] <- "Non-nullable required field `training_file` cannot be null."
      }

      if (nchar(self$`suffix`) > 40) {
        invalid_fields["suffix"] <- "Invalid length for `suffix`, must be smaller than or equal to 40."
      }
      if (nchar(self$`suffix`) < 1) {
        invalid_fields["suffix"] <- "Invalid length for `suffix`, must be bigger than or equal to 1."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateFineTuneRequest$unlock()
#
## Below is an example to define the print function
# CreateFineTuneRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateFineTuneRequest$lock()

