#' Create a new CreateEmbeddingRequest
#'
#' @description
#' CreateEmbeddingRequest Class
#'
#' @docType class
#' @title CreateEmbeddingRequest
#' @description CreateEmbeddingRequest Class
#' @format An \code{R6Class} generator object
#' @field input  \link{CreateEmbeddingRequestInput}
#' @field model  \link{CreateEmbeddingRequestModel}
#' @field encoding_format The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/). character [optional]
#' @field dimensions The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. integer [optional]
#' @field user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateEmbeddingRequest <- R6::R6Class(
  "CreateEmbeddingRequest",
  public = list(
    `input` = NULL,
    `model` = NULL,
    `encoding_format` = NULL,
    `dimensions` = NULL,
    `user` = NULL,

    #' @description
    #' Initialize a new CreateEmbeddingRequest class.
    #'
    #' @param input input
    #' @param model model
    #' @param encoding_format The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).. Default to "float".
    #' @param dimensions The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.
    #' @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
    #' @param ... Other optional arguments.
    initialize = function(`input`, `model`, `encoding_format` = "float", `dimensions` = NULL, `user` = NULL, ...) {
      if (!missing(`input`)) {
        stopifnot(R6::is.R6(`input`))
        self$`input` <- `input`
      }
      if (!missing(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
      }
      if (!is.null(`encoding_format`)) {
        if (!(`encoding_format` %in% c("float", "base64"))) {
          stop(paste("Error! \"", `encoding_format`, "\" cannot be assigned to `encoding_format`. Must be \"float\", \"base64\".", sep = ""))
        }
        if (!(is.character(`encoding_format`) && length(`encoding_format`) == 1)) {
          stop(paste("Error! Invalid data for `encoding_format`. Must be a string:", `encoding_format`))
        }
        self$`encoding_format` <- `encoding_format`
      }
      if (!is.null(`dimensions`)) {
        if (!(is.numeric(`dimensions`) && length(`dimensions`) == 1)) {
          stop(paste("Error! Invalid data for `dimensions`. Must be an integer:", `dimensions`))
        }
        self$`dimensions` <- `dimensions`
      }
      if (!is.null(`user`)) {
        if (!(is.character(`user`) && length(`user`) == 1)) {
          stop(paste("Error! Invalid data for `user`. Must be a string:", `user`))
        }
        self$`user` <- `user`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CreateEmbeddingRequest as a base R list.
    #' @examples
    #' # convert array of CreateEmbeddingRequest (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CreateEmbeddingRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateEmbeddingRequestObject <- list()
      if (!is.null(self$`input`)) {
        CreateEmbeddingRequestObject[["input"]] <-
          self$`input`$toSimpleType()
      }
      if (!is.null(self$`model`)) {
        CreateEmbeddingRequestObject[["model"]] <-
          self$`model`$toSimpleType()
      }
      if (!is.null(self$`encoding_format`)) {
        CreateEmbeddingRequestObject[["encoding_format"]] <-
          self$`encoding_format`
      }
      if (!is.null(self$`dimensions`)) {
        CreateEmbeddingRequestObject[["dimensions"]] <-
          self$`dimensions`
      }
      if (!is.null(self$`user`)) {
        CreateEmbeddingRequestObject[["user"]] <-
          self$`user`
      }
      return(CreateEmbeddingRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateEmbeddingRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEmbeddingRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`input`)) {
        `input_object` <- CreateEmbeddingRequestInput$new()
        `input_object`$fromJSON(jsonlite::toJSON(this_object$`input`, auto_unbox = TRUE, digits = NA))
        self$`input` <- `input_object`
      }
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateEmbeddingRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
      }
      if (!is.null(this_object$`encoding_format`)) {
        if (!is.null(this_object$`encoding_format`) && !(this_object$`encoding_format` %in% c("float", "base64"))) {
          stop(paste("Error! \"", this_object$`encoding_format`, "\" cannot be assigned to `encoding_format`. Must be \"float\", \"base64\".", sep = ""))
        }
        self$`encoding_format` <- this_object$`encoding_format`
      }
      if (!is.null(this_object$`dimensions`)) {
        self$`dimensions` <- this_object$`dimensions`
      }
      if (!is.null(this_object$`user`)) {
        self$`user` <- this_object$`user`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateEmbeddingRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateEmbeddingRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEmbeddingRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`input` <- CreateEmbeddingRequestInput$new()$fromJSON(jsonlite::toJSON(this_object$`input`, auto_unbox = TRUE, digits = NA))
      self$`model` <- CreateEmbeddingRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`encoding_format`) && !(this_object$`encoding_format` %in% c("float", "base64"))) {
        stop(paste("Error! \"", this_object$`encoding_format`, "\" cannot be assigned to `encoding_format`. Must be \"float\", \"base64\".", sep = ""))
      }
      self$`encoding_format` <- this_object$`encoding_format`
      self$`dimensions` <- this_object$`dimensions`
      self$`user` <- this_object$`user`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateEmbeddingRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `input`
      if (!is.null(input_json$`input`)) {
        stopifnot(R6::is.R6(input_json$`input`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEmbeddingRequest: the required field `input` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        stopifnot(R6::is.R6(input_json$`model`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEmbeddingRequest: the required field `model` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateEmbeddingRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `input` is null
      if (is.null(self$`input`)) {
        return(FALSE)
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      if (self$`dimensions` < 1) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `input` is null
      if (is.null(self$`input`)) {
        invalid_fields["input"] <- "Non-nullable required field `input` cannot be null."
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      if (self$`dimensions` < 1) {
        invalid_fields["dimensions"] <- "Invalid value for `dimensions`, must be bigger than or equal to 1."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
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

