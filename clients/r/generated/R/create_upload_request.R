#' Create a new CreateUploadRequest
#'
#' @description
#' CreateUploadRequest Class
#'
#' @docType class
#' @title CreateUploadRequest
#' @description CreateUploadRequest Class
#' @format An \code{R6Class} generator object
#' @field filename The name of the file to upload. character
#' @field purpose The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). character
#' @field bytes The number of bytes in the file you are uploading. integer
#' @field mime_type The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateUploadRequest <- R6::R6Class(
  "CreateUploadRequest",
  public = list(
    `filename` = NULL,
    `purpose` = NULL,
    `bytes` = NULL,
    `mime_type` = NULL,

    #' @description
    #' Initialize a new CreateUploadRequest class.
    #'
    #' @param filename The name of the file to upload.
    #' @param purpose The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).
    #' @param bytes The number of bytes in the file you are uploading.
    #' @param mime_type The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.
    #' @param ... Other optional arguments.
    initialize = function(`filename`, `purpose`, `bytes`, `mime_type`, ...) {
      if (!missing(`filename`)) {
        if (!(is.character(`filename`) && length(`filename`) == 1)) {
          stop(paste("Error! Invalid data for `filename`. Must be a string:", `filename`))
        }
        self$`filename` <- `filename`
      }
      if (!missing(`purpose`)) {
        if (!(`purpose` %in% c("assistants", "batch", "fine-tune", "vision"))) {
          stop(paste("Error! \"", `purpose`, "\" cannot be assigned to `purpose`. Must be \"assistants\", \"batch\", \"fine-tune\", \"vision\".", sep = ""))
        }
        if (!(is.character(`purpose`) && length(`purpose`) == 1)) {
          stop(paste("Error! Invalid data for `purpose`. Must be a string:", `purpose`))
        }
        self$`purpose` <- `purpose`
      }
      if (!missing(`bytes`)) {
        if (!(is.numeric(`bytes`) && length(`bytes`) == 1)) {
          stop(paste("Error! Invalid data for `bytes`. Must be an integer:", `bytes`))
        }
        self$`bytes` <- `bytes`
      }
      if (!missing(`mime_type`)) {
        if (!(is.character(`mime_type`) && length(`mime_type`) == 1)) {
          stop(paste("Error! Invalid data for `mime_type`. Must be a string:", `mime_type`))
        }
        self$`mime_type` <- `mime_type`
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
    #' @return CreateUploadRequest as a base R list.
    #' @examples
    #' # convert array of CreateUploadRequest (x) to a data frame
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
    #' Convert CreateUploadRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateUploadRequestObject <- list()
      if (!is.null(self$`filename`)) {
        CreateUploadRequestObject[["filename"]] <-
          self$`filename`
      }
      if (!is.null(self$`purpose`)) {
        CreateUploadRequestObject[["purpose"]] <-
          self$`purpose`
      }
      if (!is.null(self$`bytes`)) {
        CreateUploadRequestObject[["bytes"]] <-
          self$`bytes`
      }
      if (!is.null(self$`mime_type`)) {
        CreateUploadRequestObject[["mime_type"]] <-
          self$`mime_type`
      }
      return(CreateUploadRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateUploadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateUploadRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`filename`)) {
        self$`filename` <- this_object$`filename`
      }
      if (!is.null(this_object$`purpose`)) {
        if (!is.null(this_object$`purpose`) && !(this_object$`purpose` %in% c("assistants", "batch", "fine-tune", "vision"))) {
          stop(paste("Error! \"", this_object$`purpose`, "\" cannot be assigned to `purpose`. Must be \"assistants\", \"batch\", \"fine-tune\", \"vision\".", sep = ""))
        }
        self$`purpose` <- this_object$`purpose`
      }
      if (!is.null(this_object$`bytes`)) {
        self$`bytes` <- this_object$`bytes`
      }
      if (!is.null(this_object$`mime_type`)) {
        self$`mime_type` <- this_object$`mime_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateUploadRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateUploadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateUploadRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`filename` <- this_object$`filename`
      if (!is.null(this_object$`purpose`) && !(this_object$`purpose` %in% c("assistants", "batch", "fine-tune", "vision"))) {
        stop(paste("Error! \"", this_object$`purpose`, "\" cannot be assigned to `purpose`. Must be \"assistants\", \"batch\", \"fine-tune\", \"vision\".", sep = ""))
      }
      self$`purpose` <- this_object$`purpose`
      self$`bytes` <- this_object$`bytes`
      self$`mime_type` <- this_object$`mime_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateUploadRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `filename`
      if (!is.null(input_json$`filename`)) {
        if (!(is.character(input_json$`filename`) && length(input_json$`filename`) == 1)) {
          stop(paste("Error! Invalid data for `filename`. Must be a string:", input_json$`filename`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateUploadRequest: the required field `filename` is missing."))
      }
      # check the required field `purpose`
      if (!is.null(input_json$`purpose`)) {
        if (!(is.character(input_json$`purpose`) && length(input_json$`purpose`) == 1)) {
          stop(paste("Error! Invalid data for `purpose`. Must be a string:", input_json$`purpose`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateUploadRequest: the required field `purpose` is missing."))
      }
      # check the required field `bytes`
      if (!is.null(input_json$`bytes`)) {
        if (!(is.numeric(input_json$`bytes`) && length(input_json$`bytes`) == 1)) {
          stop(paste("Error! Invalid data for `bytes`. Must be an integer:", input_json$`bytes`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateUploadRequest: the required field `bytes` is missing."))
      }
      # check the required field `mime_type`
      if (!is.null(input_json$`mime_type`)) {
        if (!(is.character(input_json$`mime_type`) && length(input_json$`mime_type`) == 1)) {
          stop(paste("Error! Invalid data for `mime_type`. Must be a string:", input_json$`mime_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateUploadRequest: the required field `mime_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateUploadRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `filename` is null
      if (is.null(self$`filename`)) {
        return(FALSE)
      }

      # check if the required `purpose` is null
      if (is.null(self$`purpose`)) {
        return(FALSE)
      }

      # check if the required `bytes` is null
      if (is.null(self$`bytes`)) {
        return(FALSE)
      }

      # check if the required `mime_type` is null
      if (is.null(self$`mime_type`)) {
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
      # check if the required `filename` is null
      if (is.null(self$`filename`)) {
        invalid_fields["filename"] <- "Non-nullable required field `filename` cannot be null."
      }

      # check if the required `purpose` is null
      if (is.null(self$`purpose`)) {
        invalid_fields["purpose"] <- "Non-nullable required field `purpose` cannot be null."
      }

      # check if the required `bytes` is null
      if (is.null(self$`bytes`)) {
        invalid_fields["bytes"] <- "Non-nullable required field `bytes` cannot be null."
      }

      # check if the required `mime_type` is null
      if (is.null(self$`mime_type`)) {
        invalid_fields["mime_type"] <- "Non-nullable required field `mime_type` cannot be null."
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
# CreateUploadRequest$unlock()
#
## Below is an example to define the print function
# CreateUploadRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateUploadRequest$lock()

