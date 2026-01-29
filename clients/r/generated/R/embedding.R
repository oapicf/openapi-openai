#' Create a new Embedding
#'
#' @description
#' Represents an embedding vector returned by embedding endpoint. 
#'
#' @docType class
#' @title Embedding
#' @description Embedding Class
#' @format An \code{R6Class} generator object
#' @field index The index of the embedding in the list of embeddings. integer
#' @field embedding The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). list(numeric)
#' @field object The object type, which is always \"embedding\". character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Embedding <- R6::R6Class(
  "Embedding",
  public = list(
    `index` = NULL,
    `embedding` = NULL,
    `object` = NULL,

    #' @description
    #' Initialize a new Embedding class.
    #'
    #' @param index The index of the embedding in the list of embeddings.
    #' @param embedding The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).
    #' @param object The object type, which is always \"embedding\".
    #' @param ... Other optional arguments.
    initialize = function(`index`, `embedding`, `object`, ...) {
      if (!missing(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!missing(`embedding`)) {
        stopifnot(is.vector(`embedding`), length(`embedding`) != 0)
        sapply(`embedding`, function(x) stopifnot(is.character(x)))
        self$`embedding` <- `embedding`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("embedding"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"embedding\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
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
    #' @return Embedding as a base R list.
    #' @examples
    #' # convert array of Embedding (x) to a data frame
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
    #' Convert Embedding to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EmbeddingObject <- list()
      if (!is.null(self$`index`)) {
        EmbeddingObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`embedding`)) {
        EmbeddingObject[["embedding"]] <-
          self$`embedding`
      }
      if (!is.null(self$`object`)) {
        EmbeddingObject[["object"]] <-
          self$`object`
      }
      return(EmbeddingObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Embedding
    #'
    #' @param input_json the JSON input
    #' @return the instance of Embedding
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`embedding`)) {
        self$`embedding` <- ApiClient$new()$deserializeObj(this_object$`embedding`, "array[numeric]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("embedding"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"embedding\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Embedding in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Embedding
    #'
    #' @param input_json the JSON input
    #' @return the instance of Embedding
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`index` <- this_object$`index`
      self$`embedding` <- ApiClient$new()$deserializeObj(this_object$`embedding`, "array[numeric]", loadNamespace("openapi"))
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("embedding"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"embedding\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self
    },

    #' @description
    #' Validate JSON input with respect to Embedding and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
        if (!(is.numeric(input_json$`index`) && length(input_json$`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", input_json$`index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Embedding: the required field `index` is missing."))
      }
      # check the required field `embedding`
      if (!is.null(input_json$`embedding`)) {
        stopifnot(is.vector(input_json$`embedding`), length(input_json$`embedding`) != 0)
        tmp <- sapply(input_json$`embedding`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Embedding: the required field `embedding` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Embedding: the required field `object` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Embedding
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        return(FALSE)
      }

      # check if the required `embedding` is null
      if (is.null(self$`embedding`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
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
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
      }

      # check if the required `embedding` is null
      if (is.null(self$`embedding`)) {
        invalid_fields["embedding"] <- "Non-nullable required field `embedding` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
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
# Embedding$unlock()
#
## Below is an example to define the print function
# Embedding$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Embedding$lock()

