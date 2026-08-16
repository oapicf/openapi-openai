
/*
 * CreateModerationResponse_results_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateModerationResponse_results_inner_H_
#define TINY_CPP_CLIENT_CreateModerationResponse_results_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateModerationResponse_results_inner_categories.h"
#include "CreateModerationResponse_results_inner_category_applied_input_types.h"
#include "CreateModerationResponse_results_inner_category_scores.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateModerationResponse_results_inner{
public:

    /*! \brief Constructor.
	 */
    CreateModerationResponse_results_inner();
    CreateModerationResponse_results_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationResponse_results_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Whether any of the below categories are flagged.
	 */
	bool isFlagged();

	/*! \brief Set Whether any of the below categories are flagged.
	 */
	void setFlagged(bool  flagged);
	/*! \brief Get 
	 */
	CreateModerationResponse_results_inner_categories getCategories();

	/*! \brief Set 
	 */
	void setCategories(CreateModerationResponse_results_inner_categories  categories);
	/*! \brief Get 
	 */
	CreateModerationResponse_results_inner_category_scores getCategoryScores();

	/*! \brief Set 
	 */
	void setCategoryScores(CreateModerationResponse_results_inner_category_scores  category_scores);
	/*! \brief Get 
	 */
	CreateModerationResponse_results_inner_category_applied_input_types getCategoryAppliedInputTypes();

	/*! \brief Set 
	 */
	void setCategoryAppliedInputTypes(CreateModerationResponse_results_inner_category_applied_input_types  category_applied_input_types);


    private:
    bool flagged{};
    CreateModerationResponse_results_inner_categories categories;
    CreateModerationResponse_results_inner_category_scores category_scores;
    CreateModerationResponse_results_inner_category_applied_input_types category_applied_input_types;
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationResponse_results_inner_H_ */
