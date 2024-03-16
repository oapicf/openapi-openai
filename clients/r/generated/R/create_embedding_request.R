#' Create a new CreateEmbeddingRequest
#'
#' @description
#' CreateEmbeddingRequest Class
#'
#' @docType class
#' @title CreateEmbeddingRequest
#' @description CreateEmbeddingRequest Class
#' @format An \code{R6Class} generator object
#' @field model  \link{CreateEmbeddingRequestModel}
#' @field input  \link{CreateEmbeddingRequestInput}
#' @field user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateEmbeddingRequest <- R6::R6Class(
  "CreateEmbeddingRequest",
  public = list(
    `model` = NULL,
    `input` = NULL,
    `user` = NULL,
    #' Initialize a new CreateEmbeddingRequest class.
    #'
    #' @description
    #' Initialize a new CreateEmbeddingRequest class.
    #'
    #' @param model model
    #' @param input input
    #' @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`model`, `input`, `user` = NULL, ...) {
      if (!missing(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
      }
      if (!missing(`input`)) {
        stopifnot(R6::is.R6(`input`))
        self$`input` <- `input`
      }
      if (!is.null(`user`)) {
        if (!(is.character(`user`) && length(`user`) == 1)) {
          stop(paste("Error! Invalid data for `user`. Must be a string:", `user`))
        }
        self$`user` <- `user`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateEmbeddingRequest in JSON format
    #' @export
    toJSON = function() {
      CreateEmbeddingRequestObject <- list()
      if (!is.null(self$`model`)) {
        CreateEmbeddingRequestObject[["model"]] <-
          self$`model`$toJSON()
      }
      if (!is.null(self$`input`)) {
        CreateEmbeddingRequestObject[["input"]] <-
          self$`input`$toJSON()
      }
      if (!is.null(self$`user`)) {
        CreateEmbeddingRequestObject[["user"]] <-
          self$`user`
      }
      CreateEmbeddingRequestObject
    },
    #' Deserialize JSON string into an instance of CreateEmbeddingRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateEmbeddingRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEmbeddingRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateEmbeddingRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
      }
      if (!is.null(this_object$`input`)) {
        `input_object` <- CreateEmbeddingRequestInput$new()
        `input_object`$fromJSON(jsonlite::toJSON(this_object$`input`, auto_unbox = TRUE, digits = NA))
        self$`input` <- `input_object`
      }
      if (!is.null(this_object$`user`)) {
        self$`user` <- this_object$`user`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateEmbeddingRequest in JSON format
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
          %s
          ',
          jsonlite::toJSON(self$`input`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`user`)) {
          sprintf(
          '"user":
            "%s"
                    ',
          self$`user`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateEmbeddingRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateEmbeddingRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEmbeddingRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`model` <- CreateEmbeddingRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      self$`input` <- CreateEmbeddingRequestInput$new()$fromJSON(jsonlite::toJSON(this_object$`input`, auto_unbox = TRUE, digits = NA))
      self$`user` <- this_object$`user`
      self
    },
    #' Validate JSON input with respect to CreateEmbeddingRequest
    #'
    #' @description
    #' Validate JSON input with respect to CreateEmbeddingRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        stopifnot(R6::is.R6(input_json$`model`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEmbeddingRequest: the required field `model` is missing."))
      }
      # check the required field `input`
      if (!is.null(input_json$`input`)) {
        stopifnot(R6::is.R6(input_json$`input`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEmbeddingRequest: the required field `input` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateEmbeddingRequest
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

      # check if the required `input` is null
      if (is.null(self$`input`)) {
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

      # check if the required `input` is null
      if (is.null(self$`input`)) {
        invalid_fields["input"] <- "Non-nullable required field `input` cannot be null."
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
# CreateEmbeddingRequest$unlock()
#
## Below is an example to define the print function
# CreateEmbeddingRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateEmbeddingRequest$lock()

