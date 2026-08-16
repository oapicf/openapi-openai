
/*
 * AssistantToolsFileSearch.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssistantToolsFileSearch_H_
#define TINY_CPP_CLIENT_AssistantToolsFileSearch_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssistantToolsFileSearch_file_search.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssistantToolsFileSearch{
public:

    /*! \brief Constructor.
	 */
    AssistantToolsFileSearch();
    AssistantToolsFileSearch(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssistantToolsFileSearch();


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
	/*! \brief Get 
	 */
	AssistantToolsFileSearch_file_search getFileSearch();

	/*! \brief Set 
	 */
	void setFileSearch(AssistantToolsFileSearch_file_search  file_search);


    private:
    std::string type{};
    AssistantToolsFileSearch_file_search file_search;
};
}

#endif /* TINY_CPP_CLIENT_AssistantToolsFileSearch_H_ */
