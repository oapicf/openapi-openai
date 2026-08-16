
/*
 * FileSearchRankingOptions.h
 *
 * The ranking options for the file search. If not specified, the file search tool will use the &#x60;auto&#x60; ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 */

#ifndef TINY_CPP_CLIENT_FileSearchRankingOptions_H_
#define TINY_CPP_CLIENT_FileSearchRankingOptions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 *
 *  \ingroup Models
 *
 */

class FileSearchRankingOptions{
public:

    /*! \brief Constructor.
	 */
    FileSearchRankingOptions();
    FileSearchRankingOptions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FileSearchRankingOptions();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ranker to use for the file search. If not specified will use the `auto` ranker.
	 */
	std::string getRanker();

	/*! \brief Set The ranker to use for the file search. If not specified will use the `auto` ranker.
	 */
	void setRanker(std::string  ranker);
	/*! \brief Get The score threshold for the file search. All values must be a floating point number between 0 and 1.
	 */
	long getScoreThreshold();

	/*! \brief Set The score threshold for the file search. All values must be a floating point number between 0 and 1.
	 */
	void setScoreThreshold(long  score_threshold);


    private:
    std::string ranker{};
    long score_threshold{};
};
}

#endif /* TINY_CPP_CLIENT_FileSearchRankingOptions_H_ */
