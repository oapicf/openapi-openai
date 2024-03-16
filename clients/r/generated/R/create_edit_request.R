#' Create a new CreateEditRequest
#'
#' @description
#' CreateEditRequest Class
#'
#' @docType class
#' @title CreateEditRequest
#' @description CreateEditRequest Class
#' @format An \code{R6Class} generator object
#' @field model  \link{CreateEditRequestModel}
#' @field input The input text to use as a starting point for the edit. character [optional]
#' @field instruction The instruction that tells the model how to edit the prompt. character
#' @field n How many edits to generate for the input and instruction. integer [optional]
#' @field temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. numeric [optional]
#' @field top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10\% probability mass are considered.  We generally recommend altering this or `temperature` but not both. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateEditRequest <- R6::R6Class(
  "CreateEditRequest",
  public = list(
    `model` = NULL,
    `input` = NULL,
    `instruction` = NULL,
    `n` = NULL,
    `temperature` = NULL,
    `top_p` = NULL,
    #' Initialize a new CreateEditRequest class.
    #'
    #' @description
    #' Initialize a new CreateEditRequest class.
    #'
    #' @param model model
    #' @param instruction The instruction that tells the model how to edit the prompt.
    #' @param input The input text to use as a starting point for the edit.. Default to "".
    #' @param n How many edits to generate for the input and instruction.. Default to 1.
    #' @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.. Default to 1.
    #' @param top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10\% probability mass are considered.  We generally recommend altering this or `temperature` but not both.. Default to 1.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`model`, `instruction`, `input` = "", `n` = 1, `temperature` = 1, `top_p` = 1, ...) {
      if (!missing(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
      }
      if (!missing(`instruction`)) {
        if (!(is.character(`instruction`) && length(`instruction`) == 1)) {
          stop(paste("Error! Invalid data for `instruction`. Must be a string:", `instruction`))
        }
        self$`instruction` <- `instruction`
      }
      if (!is.null(`input`)) {
        if (!(is.character(`input`) && length(`input`) == 1)) {
          stop(paste("Error! Invalid data for `input`. Must be a string:", `input`))
        }
        self$`input` <- `input`
      }
      if (!is.null(`n`)) {
        if (!(is.numeric(`n`) && length(`n`) == 1)) {
          stop(paste("Error! Invalid data for `n`. Must be an integer:", `n`))
        }
        self$`n` <- `n`
      }
      if (!is.null(`temperature`)) {
        self$`temperature` <- `temperature`
      }
      if (!is.null(`top_p`)) {
        self$`top_p` <- `top_p`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateEditRequest in JSON format
    #' @export
    toJSON = function() {
      CreateEditRequestObject <- list()
      if (!is.null(self$`model`)) {
        CreateEditRequestObject[["model"]] <-
          self$`model`$toJSON()
      }
      if (!is.null(self$`input`)) {
        CreateEditRequestObject[["input"]] <-
          self$`input`
      }
      if (!is.null(self$`instruction`)) {
        CreateEditRequestObject[["instruction"]] <-
          self$`instruction`
      }
      if (!is.null(self$`n`)) {
        CreateEditRequestObject[["n"]] <-
          self$`n`
      }
      if (!is.null(self$`temperature`)) {
        CreateEditRequestObject[["temperature"]] <-
          self$`temperature`
      }
      if (!is.null(self$`top_p`)) {
        CreateEditRequestObject[["top_p"]] <-
          self$`top_p`
      }
      CreateEditRequestObject
    },
    #' Deserialize JSON string into an instance of CreateEditRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateEditRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEditRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateEditRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
      }
      if (!is.null(this_object$`input`)) {
        self$`input` <- this_object$`input`
      }
      if (!is.null(this_object$`instruction`)) {
        self$`instruction` <- this_object$`instruction`
      }
      if (!is.null(this_object$`n`)) {
        self$`n` <- this_object$`n`
      }
      if (!is.null(this_object$`temperature`)) {
        self$`temperature` <- this_object$`temperature`
      }
      if (!is.null(this_object$`top_p`)) {
        self$`top_p` <- this_object$`top_p`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateEditRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
          %s
          ',
          jsonlite::toJSON(self$`model`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`input`)) {
          sprintf(
          '"input":
            "%s"
                    ',
          self$`input`
          )
        },
        if (!is.null(self$`instruction`)) {
          sprintf(
          '"instruction":
            "%s"
                    ',
          self$`instruction`
          )
        },
        if (!is.null(self$`n`)) {
          sprintf(
          '"n":
            %d
                    ',
          self$`n`
          )
        },
        if (!is.null(self$`temperature`)) {
          sprintf(
          '"temperature":
            %d
                    ',
          self$`temperature`
          )
        },
        if (!is.null(self$`top_p`)) {
          sprintf(
          '"top_p":
            %d
                    ',
          self$`top_p`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateEditRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateEditRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEditRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`model` <- CreateEditRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      self$`input` <- this_object$`input`
      self$`instruction` <- this_object$`instruction`
      self$`n` <- this_object$`n`
      self$`temperature` <- this_object$`temperature`
      self$`top_p` <- this_object$`top_p`
      self
    },
    #' Validate JSON input with respect to CreateEditRequest
    #'
    #' @description
    #' Validate JSON input with respect to CreateEditRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        stopifnot(R6::is.R6(input_json$`model`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEditRequest: the required field `model` is missing."))
      }
      # check the required field `instruction`
      if (!is.null(input_json$`instruction`)) {
        if (!(is.character(input_json$`instruction`) && length(input_json$`instruction`) == 1)) {
          stop(paste("Error! Invalid data for `instruction`. Must be a string:", input_json$`instruction`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEditRequest: the required field `instruction` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateEditRequest
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
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      # check if the required `instruction` is null
      if (is.null(self$`instruction`)) {
        return(FALSE)
      }

      if (self$`n` > 20) {
        return(FALSE)
      }
      if (self$`n` < 1) {
        return(FALSE)
      }

      if (self$`temperature` > 2) {
        return(FALSE)
      }
      if (self$`temperature` < 0) {
        return(FALSE)
      }

      if (self$`top_p` > 1) {
        return(FALSE)
      }
      if (self$`top_p` < 0) {
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
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `instruction` is null
      if (is.null(self$`instruction`)) {
        invalid_fields["instruction"] <- "Non-nullable required field `instruction` cannot be null."
      }

      if (self$`n` > 20) {
        invalid_fields["n"] <- "Invalid value for `n`, must be smaller than or equal to 20."
      }
      if (self$`n` < 1) {
        invalid_fields["n"] <- "Invalid value for `n`, must be bigger than or equal to 1."
      }

      if (self$`temperature` > 2) {
        invalid_fields["temperature"] <- "Invalid value for `temperature`, must be smaller than or equal to 2."
      }
      if (self$`temperature` < 0) {
        invalid_fields["temperature"] <- "Invalid value for `temperature`, must be bigger than or equal to 0."
      }

      if (self$`top_p` > 1) {
        invalid_fields["top_p"] <- "Invalid value for `top_p`, must be smaller than or equal to 1."
      }
      if (self$`top_p` < 0) {
        invalid_fields["top_p"] <- "Invalid value for `top_p`, must be bigger than or equal to 0."
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
# CreateEditRequest$unlock()
#
## Below is an example to define the print function
# CreateEditRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateEditRequest$lock()

