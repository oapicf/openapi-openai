#' @docType class
#' @title AssistantsApiResponseFormatOption
#'
#' @description AssistantsApiResponseFormatOption Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantsApiResponseFormatOption <- R6::R6Class(
  "AssistantsApiResponseFormatOption",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("ResponseFormatJsonObject", "ResponseFormatJsonSchema", "ResponseFormatText", "character"),

    #' @description
    #' Initialize a new AssistantsApiResponseFormatOption.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "ResponseFormatJsonObject", "ResponseFormatJsonSchema", "ResponseFormatText", "character"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ResponseFormatJsonObject") {
        self$actual_instance <- instance
        self$actual_type <- "ResponseFormatJsonObject"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ResponseFormatJsonSchema") {
        self$actual_instance <- instance
        self$actual_type <- "ResponseFormatJsonSchema"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ResponseFormatText") {
        self$actual_instance <- instance
        self$actual_type <- "ResponseFormatText"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "character") {
        self$actual_instance <- instance
        self$actual_type <- "character"
      } else {
        stop(paste("Failed to initialize AssistantsApiResponseFormatOption with oneOf schemas ResponseFormatJsonObject, ResponseFormatJsonSchema, ResponseFormatText, character. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantsApiResponseFormatOption.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of AssistantsApiResponseFormatOption.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantsApiResponseFormatOption.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of AssistantsApiResponseFormatOption.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `character_result` <- tryCatch({
          instance <- jsonlite::fromJSON(input, simplifyVector = FALSE)
          if (typeof(instance) != "character") {
            stop(sprintf("Data type doesn't match. Expected: %s. Actual: %s.", "character", typeof(instance)))
          }
          instance_type <- "character"
          matched_schemas <- append(matched_schemas, "character")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`character_result`["error"])) {
        error_messages <- append(error_messages, `character_result`["message"])
      }

      `ResponseFormatText_result` <- tryCatch({
          `ResponseFormatText`$public_methods$validateJSON(input)
          `ResponseFormatText_instance` <- `ResponseFormatText`$new()
          instance <- `ResponseFormatText_instance`$fromJSON(input)
          instance_type <- "ResponseFormatText"
          matched_schemas <- append(matched_schemas, "ResponseFormatText")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ResponseFormatText_result`["error"])) {
        error_messages <- append(error_messages, `ResponseFormatText_result`["message"])
      }

      `ResponseFormatJsonObject_result` <- tryCatch({
          `ResponseFormatJsonObject`$public_methods$validateJSON(input)
          `ResponseFormatJsonObject_instance` <- `ResponseFormatJsonObject`$new()
          instance <- `ResponseFormatJsonObject_instance`$fromJSON(input)
          instance_type <- "ResponseFormatJsonObject"
          matched_schemas <- append(matched_schemas, "ResponseFormatJsonObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ResponseFormatJsonObject_result`["error"])) {
        error_messages <- append(error_messages, `ResponseFormatJsonObject_result`["message"])
      }

      `ResponseFormatJsonSchema_result` <- tryCatch({
          `ResponseFormatJsonSchema`$public_methods$validateJSON(input)
          `ResponseFormatJsonSchema_instance` <- `ResponseFormatJsonSchema`$new()
          instance <- `ResponseFormatJsonSchema_instance`$fromJSON(input)
          instance_type <- "ResponseFormatJsonSchema"
          matched_schemas <- append(matched_schemas, "ResponseFormatJsonSchema")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ResponseFormatJsonSchema_result`["error"])) {
        error_messages <- append(error_messages, `ResponseFormatJsonSchema_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into AssistantsApiResponseFormatOption with oneOf schemas ResponseFormatJsonObject, ResponseFormatJsonSchema, ResponseFormatText, character. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into AssistantsApiResponseFormatOption with oneOf schemas ResponseFormatJsonObject, ResponseFormatJsonSchema, ResponseFormatText, character. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize AssistantsApiResponseFormatOption to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the AssistantsApiResponseFormatOption.
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      if (!is.null(self$actual_instance)) {
        json <- jsonlite::toJSON(simple, auto_unbox = TRUE, ...)
        return(as.character(jsonlite::minify(json)))
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert AssistantsApiResponseFormatOption to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      if (!is.null(self$actual_instance)) {
        return(self$actual_instance$toSimpleType())
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Validate the input JSON with respect to AssistantsApiResponseFormatOption and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#AssistantsApiResponseFormatOption$unlock()
#
## Below is an example to define the print function
#AssistantsApiResponseFormatOption$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#AssistantsApiResponseFormatOption$lock()

