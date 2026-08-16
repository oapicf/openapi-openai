
/*
 * AssistantToolsFileSearch_file_search.h
 *
 * Overrides for the file search tool.
 */

#ifndef TINY_CPP_CLIENT_AssistantToolsFileSearch_file_search_H_
#define TINY_CPP_CLIENT_AssistantToolsFileSearch_file_search_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FileSearchRankingOptions.h"

namespace Tiny {


/*! \brief Overrides for the file search tool.
 *
 *  \ingroup Models
 *
 */

class AssistantToolsFileSearch_file_search{
public:

    /*! \brief Constructor.
	 */
    AssistantToolsFileSearch_file_search();
    AssistantToolsFileSearch_file_search(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssistantToolsFileSearch_file_search();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
	 */
	int getMaxNumResults();

	/*! \brief Set The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
	 */
	void setMaxNumResults(int  max_num_results);
	/*! \brief Get 
	 */
	FileSearchRankingOptions getRankingOptions();

	/*! \brief Set 
	 */
	void setRankingOptions(FileSearchRankingOptions  ranking_options);


    private:
    int max_num_results{};
    FileSearchRankingOptions ranking_options;
};
}

#endif /* TINY_CPP_CLIENT_AssistantToolsFileSearch_file_search_H_ */
