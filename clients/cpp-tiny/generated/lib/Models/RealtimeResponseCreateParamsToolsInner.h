
/*
 * RealtimeResponseCreateParams_tools_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RealtimeResponseCreateParams_tools_inner_H_
#define TINY_CPP_CLIENT_RealtimeResponseCreateParams_tools_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RealtimeResponseCreateParams_tools_inner{
public:

    /*! \brief Constructor.
	 */
    RealtimeResponseCreateParams_tools_inner();
    RealtimeResponseCreateParams_tools_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeResponseCreateParams_tools_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of the tool, i.e. `function`.
	 */
	std::string getType();

	/*! \brief Set The type of the tool, i.e. `function`.
	 */
	void setType(std::string  type);
	/*! \brief Get The name of the function.
	 */
	std::string getName();

	/*! \brief Set The name of the function.
	 */
	void setName(std::string  name);
	/*! \brief Get The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
	 */
	std::string getDescription();

	/*! \brief Set The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
	 */
	void setDescription(std::string  description);
	/*! \brief Get Parameters of the function in JSON Schema.
	 */
	Object getParameters();

	/*! \brief Set Parameters of the function in JSON Schema.
	 */
	void setParameters(Object  parameters);


    private:
    std::string type{};
    std::string name{};
    std::string description{};
    Object parameters;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeResponseCreateParams_tools_inner_H_ */
