/*
 * CreateModerationResponse_results_inner.h
 *
 * 
 */

#ifndef _CreateModerationResponse_results_inner_H_
#define _CreateModerationResponse_results_inner_H_


#include <string>
#include "CreateModerationResponse_results_inner_categories.h"
#include "CreateModerationResponse_results_inner_category_applied_input_types.h"
#include "CreateModerationResponse_results_inner_category_scores.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateModerationResponse_results_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationResponse_results_inner();
	CreateModerationResponse_results_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationResponse_results_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether any of the below categories are flagged.
	 */
	bool getFlagged();

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
	bool flagged;
	CreateModerationResponse_results_inner_categories categories;
	CreateModerationResponse_results_inner_category_scores category_scores;
	CreateModerationResponse_results_inner_category_applied_input_types category_applied_input_types;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateModerationResponse_results_inner_H_ */
