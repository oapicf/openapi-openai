
/*
 * AssistantToolsFileSearchTypeOnly.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssistantToolsFileSearchTypeOnly_H_
#define TINY_CPP_CLIENT_AssistantToolsFileSearchTypeOnly_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssistantToolsFileSearchTypeOnly{
public:

    /*! \brief Constructor.
	 */
    AssistantToolsFileSearchTypeOnly();
    AssistantToolsFileSearchTypeOnly(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssistantToolsFileSearchTypeOnly();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of tool being defined: `file_search`
	 */
	std::string getType();

	/*! \brief Set The type of tool being defined: `file_search`
	 */
	void setType(std::string  type);


    private:
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_AssistantToolsFileSearchTypeOnly_H_ */
