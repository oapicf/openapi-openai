
/*
 * ResponseFormatJsonSchema.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ResponseFormatJsonSchema_H_
#define TINY_CPP_CLIENT_ResponseFormatJsonSchema_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ResponseFormatJsonSchema_json_schema.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ResponseFormatJsonSchema{
public:

    /*! \brief Constructor.
	 */
    ResponseFormatJsonSchema();
    ResponseFormatJsonSchema(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ResponseFormatJsonSchema();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of response format being defined: `json_schema`
	 */
	std::string getType();

	/*! \brief Set The type of response format being defined: `json_schema`
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ResponseFormatJsonSchema_json_schema getJsonSchema();

	/*! \brief Set 
	 */
	void setJsonSchema(ResponseFormatJsonSchema_json_schema  json_schema);


    private:
    std::string type{};
    ResponseFormatJsonSchema_json_schema json_schema;
};
}

#endif /* TINY_CPP_CLIENT_ResponseFormatJsonSchema_H_ */
